package com.rainbow.controller;

import com.jfinal.core.Controller;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class TestController extends Controller {
    public void index(){
        renderText("请求路径不对");
    }
    public void test(){
        renderText("请求参数不对");
    }
}
