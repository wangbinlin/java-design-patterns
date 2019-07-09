package com.iluwatar.abstractfactory3;

/**
 * OracleUser
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class OracleUser implements IUser {
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户信息!");
    }

    @Override
    public void save() {
        System.out.println("Oracle保存用户信息!");
    }
}
