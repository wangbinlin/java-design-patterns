package com.iluwatar.abstractfactory;

/**
 * WordXDocument
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class WordXDocument implements  IWordDocument {
    @Override
    public void imports() {
        System.out.println("imort wordx");
    }
}
