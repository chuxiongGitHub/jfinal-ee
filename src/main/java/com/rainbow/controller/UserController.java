package com.rainbow.controller;

import com.jfinal.core.Controller;

/**
 * Created by rainbow on 2016/7/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class UserController extends Controller {
    /**
     * 访问/user进入到index方法，直接进入list.jsp页面
     */
    public void index(){
        render("list.jsp");
    }

    /**
     * 访问/user/form进入到form.jsp页面
     */
    public void form(){
        render("form.jsp");
    }
}
