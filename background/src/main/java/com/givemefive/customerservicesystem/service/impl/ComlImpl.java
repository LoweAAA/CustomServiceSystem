package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Coml;
import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.repostory.ComlDao;
import com.givemefive.customerservicesystem.service.ComlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComlImpl implements ComlService {

    private Result result;
    private Constant constant = new Constant();

    @Autowired
    private ComlDao comlDao;


    @Override
    public Result addComl(Coml coml) {
        result = new Result();
        if(coml != null){
            try{
                comlDao.addComl(coml);
                result.setComplete(true);
                result.setERRmessage(constant.ADD_SUCCESSFUL);
            }catch (Exception e){
                System.out.println(e);
                result.setERRmessage(constant.UNKNOWERROR);
            }
        }else {
            result.setComplete(false);
            result.setERRmessage(constant.DATA_IS_EMPTY);
        }

        return result;
    }

    @Override
    public Result update(Coml coml) {
        result = new Result();
        if (coml == null){
            result.setComplete(false);
            result.setERRmessage(constant.DATA_IS_EMPTY);
        }else if(comlDao.queryById(coml.getComlId()) == null){
            result.setComplete(false);
            result.setERRmessage(constant.ITEM_ISNOT_EXIST);
        }else {
            try{
                comlDao.update(coml);
                result.setComplete(true);
                result.setERRmessage(constant.UPDATE_SUCCESSFUL);
            }catch (Exception e){
                System.out.println(e);
                result.setERRmessage(constant.UNKNOWERROR);
            }
        }
        return result;
    }

    @Override
    public Result delete(int id) {
        result = new Result();
        if(comlDao.queryById(id) == null){
            result.setComplete(false);
            result.setERRmessage(constant.ITEM_ISNOT_EXIST);
        }else {
            try{
                comlDao.delete(id);
                result.setComplete(true);
                result.setERRmessage(constant.DELETE_SUCCESSFUL);
            }catch (Exception e){
                System.out.println(e);
                result.setERRmessage(constant.UNKNOWERROR);
            }
        }
        return result;
    }

    @Override
    public List<Coml> queryByCom(String comName) {
        List<Coml> list = comlDao.queryByCom(comName);
        return list;
    }


    @Override
    public Coml queryById(int id ){
        Coml coml = comlDao.queryById(id);
        return coml;
    }

    @Override
    public List<Coml> getAll() {
        List<Coml> list = comlDao.getAll();
        return list;
    }


}
