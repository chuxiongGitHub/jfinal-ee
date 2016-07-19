package com.rainbow.entity;

import com.jfinal.plugin.activerecord.Model;

/**
 * Created by rainbow on 2016/7/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class User extends Model<User> {
    public static final User dao=new User();
    public static final int SEX_MALE=1;//男
    public static final int SEX_FREMAL=2;//女
}
