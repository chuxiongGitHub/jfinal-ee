package com.rainbow;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.rainbow.controller.HelloController;
import com.rainbow.controller.TestController;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/test", TestController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/", 5);
    }
}
