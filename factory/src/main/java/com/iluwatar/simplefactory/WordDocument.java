package com.iluwatar.simplefactory;

/**
 * WordDocument
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class WordDocument implements IDocument {
    @Override
    public void imports() {
        System.out.println("Import Word");
    }
}
