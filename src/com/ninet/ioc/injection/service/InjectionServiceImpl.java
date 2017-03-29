package com.ninet.ioc.injection.service;

import com.ninet.ioc.injection.dao.InjectionDAO;

/**
 * Created by Ninet on 2017/3/29.
 */
public class InjectionServiceImpl implements InjectionService{

    private InjectionDAO injectionDAO;

    /*public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }*/

    public InjectionServiceImpl() {
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service receive arg: " + arg);

        arg = arg + "its (hashCode) is " + this.hashCode();

        injectionDAO.save(arg);
    }
}
