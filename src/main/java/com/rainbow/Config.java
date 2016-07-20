package com.rainbow;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.rainbow.controller.HelloController;
import com.rainbow.controller.IndexController;
import com.rainbow.controller.TestController;
import com.rainbow.controller.UserController;
import com.rainbow.entity.Blog;
import com.rainbow.entity.User;

/**
 * Created by rainbow on 2016/7/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        //使用常量包
        PropKit.use("jdbc.properties");
        me.setViewType(ViewType.JSP);
        me.setEncoding("UTF-8");
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/", IndexController.class);
        me.add("/hello", HelloController.class);
        me.add("/test", TestController.class);
        me.add("/user", UserController.class);
    }

    @Override
    public void configPlugin(Plugins me) {
//        //阿里druid数据库连接池配置
//        PropKit.use("jdbc.properties");
//        final String URL = PropKit.get("jdbcUrl");
//        final String USERNAME = PropKit.get("jdbcUser");
//        final String PASSWORD = PropKit.get("jdbcPassword");
//        final String DRIVER = PropKit.get("jdbcDriver");
//        final Integer INITIALSIZE = PropKit.getInt("jdbcInitialSize");
//        final Integer MIDIDLE = PropKit.getInt("jdbcMaxIdle");
//        final Integer MAXACTIVEE = PropKit.getInt("jdbcMaxActive");
//        DruidPlugin druidPlugin = new DruidPlugin(URL, USERNAME, PASSWORD);
//        druidPlugin.set(INITIALSIZE, MIDIDLE, MAXACTIVEE);
//        druidPlugin.setFilters("stat,wall");
//        me.add(druidPlugin);
//        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
//        //加入数据表的映射
//        me.add(activeRecordPlugin);

        //使用C3p0数据库连接池

        C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
        //配置ActiveRecord
        ActiveRecordPlugin activeRecordPlugin=new ActiveRecordPlugin(c3p0Plugin);
        //输出SQL语句
        activeRecordPlugin.setShowSql(true);
        //模型映射
        activeRecordPlugin.addMapping("user",User.class);
        activeRecordPlugin.addMapping("blog", Blog.class);
        me.add(c3p0Plugin);
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
