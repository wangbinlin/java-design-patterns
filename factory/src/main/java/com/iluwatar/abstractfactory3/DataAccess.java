package com.iluwatar.abstractfactory3;

/**
 * DataAccess
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/5
 */
public class DataAccess implements  IFactory {
    @Override
    public IUser createUser(FactoryEnum factoryEnum) {
        IUser user = null;
        switch (factoryEnum) {
            case Mysql:
                user = new MySqlUser();
                break;
            case Oracle:
                user = new OracleUser();
                break;
        }
        return user;
    }
}

  enum FactoryEnum {
      Mysql, Oracle

  }
