package com.iluwatar.abstractfactory;

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
        OfficeFactory officeFactory = new OfficeFactory();
       IWordDocument word= officeFactory.createWord();
               word.imports();

        OfficeXFactory officexFactory = new OfficeXFactory();
        IWordDocument wordx=officexFactory.createWord();
        wordx.imports();
    }
}
