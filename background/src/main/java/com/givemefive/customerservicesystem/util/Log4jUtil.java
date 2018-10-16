package com.givemefive.customerservicesystem.util;

import org.apache.log4j.Logger;
import sun.reflect.Reflection;

/**
 * 不使用了
 */
public class Log4jUtil {
    private static Logger logger =  null;

    public static Logger info(String message){
        if (null == logger){
            //Java8 废弃了Reflection.getCallerClass()
            //logger = Logger.getLogger(Reflection.getCallerClass().getName());
            StringBuilder className = new StringBuilder(new Exception().getStackTrace()[1].getClassName()).append(" : ").append(new Exception().getStackTrace()[1].getMethodName());
            logger = Logger.getLogger(String.valueOf(className));
            logger.info("["+ className +"]"+message);
        }
        return logger;
    }

/*    public static Logger debug(){

    }*/

}
