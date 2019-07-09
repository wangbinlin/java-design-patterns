package com.iluwatar.abstractfactory2;

/**
 * MySqlUser
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class MySqlUser implements  IUser {
    @Override
    public void getUser() {
        System.out.println("MySql获取用户信息!");
    }

    @Override
    public void save() {
        System.out.println("MySql保存用户信息!");
    }
}
