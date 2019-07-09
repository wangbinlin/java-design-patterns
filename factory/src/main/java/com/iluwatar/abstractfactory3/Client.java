package com.iluwatar.abstractfactory3;

/**
 * Client
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class Client {
    public static void main(String[] args) {
        //IFactory factory = new MysqlFactory();
        DataAccess factory = new DataAccess();
        IUser user = factory.createUser(FactoryEnum.Mysql);
        user.save();
/*
* 抽象工厂  改造成简单工厂
*
* */

    }
}
