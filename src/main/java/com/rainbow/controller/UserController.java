package com.rainbow.controller;

import com.jfinal.core.Controller;
import com.rainbow.entity.User;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by rainbow on 2016/7/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class UserController extends Controller {
    public static final Logger logger=Logger.getLogger(UserController.class);
    /**
     * 访问/user进入到index方法，直接进入list.jsp页面
     */
    public void index(){
        List<User> userList=User.dao.find("select * from user order by id asc");
        setAttr("userList",userList);
      logger.info("得到的数据有"+userList.size()+"条");
        render("list.jsp");
    }

    /**
     * 访问/user/form进入到form.jsp页面
     */
    public void form(){
        Integer id=getParaToInt(0);
        if(id!=null&&id>0){
            setAttr("user",User.dao.findById(id));
        }

        render("form.jsp");
    }
    /**
     * 编辑方法
     */
    public void edit(){
        form();
    }
    /**
     * 提交方法
     */
    public void submit(){
        User user=getModel(User.class,"user");
        logger.info("开始调用save方法保存数据");
        user.save();
        redirect("/user");
    }
    /**
     * 删除方法
     */
    public void del(){
        User.dao.deleteById(getPara(0));
        logger.info("删除的数据id是："+getPara(0));
        redirect("/user");
    }
    /**
     * 更新方法
     */
    public void update(){
        User user=getModel(User.class,"user");
        user.update();
        redirect("/user");
    }
}
