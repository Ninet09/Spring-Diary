package com.ninet.ioc.injection.dao;

/**
 * Created by Ninet on 2017/3/29.
 */
public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String arg) {
        System.out.println("DAO Save data: " + arg);
    }
}
