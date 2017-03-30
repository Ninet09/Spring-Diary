package com.ninet.test.ioc.interfaces;

import com.ninet.bean.BeanScope;
import org.junit.Test;

/**
 * Created by Ninet on 2017/3/30.
 */
public class TestBeanScope extends UnitTestCase {

    public TestBeanScope(){
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay1(){
        BeanScope beanScope1 = super.getBean("beanScope");
        beanScope1.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2(){
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}
