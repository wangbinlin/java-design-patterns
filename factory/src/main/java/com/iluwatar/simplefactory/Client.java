package com.iluwatar.simplefactory;

/**
 * Client
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class Client {
    public static void main(String[] args) {

       IDocument word= DocumentFactory.Create("word");
       word.imports();
        IDocument excel= DocumentFactory.Create("excel");
        excel.imports();

    }
}
