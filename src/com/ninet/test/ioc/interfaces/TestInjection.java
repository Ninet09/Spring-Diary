package com.ninet.test.ioc.interfaces;

import com.ninet.ioc.injection.service.InjectionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Ninet on 2017/3/29.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestCase {

    public TestInjection() {
        super("classpath*:spring-injection.xml");
    }

    @Test
    public void testSetter(){
        InjectionServiceImpl injectionService = super.getBean("injectionService");
        injectionService.save("<arg>");
    }

   /* @Test
    public void testConstructor(){
        InjectionServiceImpl injectionService = super.getBean("injectionService");
        injectionService.save("<arg>");
    }*/
}
