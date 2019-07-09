package com.iluwatar.factorymethod;

import com.iluwatar.simplefactory.IDocument;

/**
 * Client
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class Client {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        IWordDocument word = documentFactory.createWord();
        word.imports();
        DocumentXFactory documentXFactory = new DocumentXFactory();
        IWordDocument wordx = documentXFactory.createWordX();
        wordx.imports();

    }
}
