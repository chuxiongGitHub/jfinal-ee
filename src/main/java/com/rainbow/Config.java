package com.rainbow;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.rainbow.controller.HelloController;
import com.rainbow.controller.TestController;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setEncoding("UTF-8");
        me.setViewType(ViewType.JSP);
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/test", TestController.class);
    }

    @Override
    public void configPlugin(Plugins me) {
//启用jfinal插件
        PropKit.use("jdbc.properties");
final String URL=PropKit.get("jdbcUrl");
        final  String USERNAME=PropKit.get("jdbcUser");
        final String PASSWORD=PropKit.get("jdbcPassword");
        final String DRIVER=PropKit.get("jdbcDriver");
        final Integer INITIALSIZE = PropKit.getInt("jdbcInitialSize");
        final Integer MIDIDLE = PropKit.getInt("jdbcMaxIdle");
        final Integer MAXACTIVEE = PropKit.getInt("jdbcMaxActive");
        DruidPlugin druidPlugin=new DruidPlugin(URL,USERNAME,PASSWORD);
        druidPlugin.set(INITIALSIZE,MIDIDLE,MAXACTIVEE);
        druidPlugin.setFilters("stat,wall");
        me.add(druidPlugin);

        ActiveRecordPlugin activeRecordPlugin=new ActiveRecordPlugin(druidPlugin);
        //加入数据表的映射
        me.add(activeRecordPlugin);

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
