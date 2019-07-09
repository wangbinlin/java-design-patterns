package com.iluwatar.abstractfactory3;

public interface IFactory {
    IUser createUser(FactoryEnum factoryEnum);
}
