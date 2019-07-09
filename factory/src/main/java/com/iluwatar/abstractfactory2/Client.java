package com.iluwatar.abstractfactory2;

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
        IFactory factory = new OracleFactory();
        IUser user = factory.createUser();
        user.save();
/*
* 抽象工厂
* 将不同数据库DB的实例化，封装到不同工厂操作。
* 抽象工厂简单地说是工厂的工厂，抽象工厂可以创建具体工厂，由具体工厂来产生具体产品。
* 使用场景：用来生产不同产品族的全部产品。（不支持拓展增加产品；支持增加产品族）
* 优点：
*
* 缺点：客户端代码显然不会只有一个，如果我有100个调用数据库访问的类，是不是就要更改100次*
*
* 简单工厂、工厂方法、抽象工厂之小结、区别
* 简单工厂 ： 用来生产同一等级结构中的任意产品。（不支持拓展增加产品）
* 工厂方法 ：用来生产同一等级结构中的固定产品。（支持拓展增加产品）
* 抽象工厂 ：用来生产不同产品族的全部产品。（不支持拓展增加产品；支持增加产品族）
*
* */

    }
}
