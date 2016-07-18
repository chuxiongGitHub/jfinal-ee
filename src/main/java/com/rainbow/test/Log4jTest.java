package com.rainbow.test;


import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class Log4jTest {
    public static Logger log = Logger.getLogger(Log4jTest.class);
    @Test
    public void add(){
        log.info("这是测试信息");
        int a=33;
        int b=55;
        System.out.println(a+b);
    }
}
