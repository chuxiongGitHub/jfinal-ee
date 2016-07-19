package com.rainbow.controller;

import com.jfinal.core.Controller;

/**
 * Created by rainbow on 2016/7/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class IndexController extends Controller {
    public void index(){
        render("user/form.jsp");
    }
}
