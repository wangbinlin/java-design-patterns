package com.iluwatar.factorymethod;

/**
 * WordDocument
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class WordDocument implements  IWordDocument {
    @Override
    public void imports() {
        System.out.println("import word");
    }
}
