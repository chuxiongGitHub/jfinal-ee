package com.rainbow.controller;

import com.jfinal.core.Controller;
import org.apache.log4j.Logger;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class HelloController  extends Controller{
    public static Logger logger=Logger.getLogger(HelloController.class);
public void index(){
    logger.info("开始请求hello方法");
    renderText("请求参数不对");
}
}
