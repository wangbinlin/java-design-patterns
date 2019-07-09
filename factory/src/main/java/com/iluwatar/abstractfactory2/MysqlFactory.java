package com.iluwatar.abstractfactory2;

/**
 * MysqlFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }
}
