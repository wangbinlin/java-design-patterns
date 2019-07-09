package com.iluwatar.abstractfactory2;

/**
 * OracleFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class OracleFactory implements  IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }
}
