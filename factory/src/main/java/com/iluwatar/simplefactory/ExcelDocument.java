package com.iluwatar.simplefactory;

/**
 * ExcelDocument
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class ExcelDocument implements IDocument {
    @Override
    public void imports() {
        System.out.println("import excel");
    }
}
