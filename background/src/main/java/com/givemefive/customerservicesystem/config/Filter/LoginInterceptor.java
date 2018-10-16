package com.givemefive.customerservicesystem.config.Filter;

import com.alibaba.fastjson.JSON;
import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.service.util.utilImpl.MD5Util;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 单个实现类的执行顺序
 * preHandler -> Controller -> postHandler -> model渲染-> afterCompletion
 */
public class LoginInterceptor implements HandlerInterceptor{

    public static Logger logger = Logger.getLogger(LoginInterceptor.class.getName());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object o) throws Exception{

        /*该方法将在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller，
        当返回值为true 时就会继续调用下一个Interceptor的preHandle 方法，
        如果已经是最后一个Interceptor的时候就会是调用当前请求的Controller方法；*/


        //登录拦截
        if (request.getRequestURI().equals("/company/login")){
            return true;
        }



        //登录拦截
        if (request.getRequestURI().equals("/company/getCominfo")){
            Cookie[] cookies = request.getCookies();
            logger.info(String.valueOf(cookies));
            String ExistToken = "";
            String token = "";
            String comId = "";
            for (Cookie cookie : cookies){
                if ("comToken".equals(cookie.getName())){
                    token = cookie.getValue();
                }else if ("comId".equals(cookie.getName())){
                    comId = cookie.getValue();
                }
            }
            if (comId == ""){
                logger.error("Cookie出错! token: " + token);
                response.sendRedirect("/front/util/ERROE.html");
                return false;
            }

            try{
                ExistToken = MD5Util.MD5EncodeUtf8Token(comId + Constant.TOKEN_MD5_PART);
                if (ExistToken.equals(token)){
                    //验证成功


//                response.sendRedirect("../firstpage/first.html");
                }else {
                    //清除cookie返回首页
                    for (Cookie cookie : cookies){
                        if ("comToken".equals(cookie.getName())){
                            cookie.setMaxAge(0);
                            cookie.setPath("/");
                            response.addCookie(cookie);
                        }else if ("comId".equals(cookie.getName())){
                            cookie.setMaxAge(0);
                            cookie.setPath("/");
                            response.addCookie(cookie);
                        }
                    }
                    response.sendRedirect("../firstpage/first.html");
                }
            }catch (Exception e){
                logger.error(e);
            }


            return false;
        }

        /*//验证session是否存在
        Object obj = request.getSession().getAttribute("_session_user");
        if (obj == null){
            response.sendRedirect("/company/login");
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        /*该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行，
        该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行。
        用于进行资源清理。*/

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
             throws Exception {
        /*该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用，
        可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作。*/


    }

}
