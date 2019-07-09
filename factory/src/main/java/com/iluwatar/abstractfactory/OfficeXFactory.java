package com.iluwatar.abstractfactory;

/**
 * OfficeXFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class OfficeXFactory implements  IFactory {
    @Override
    public IWordDocument createWord() {
        return new WordXDocument();
    }

    @Override
    public IExcelDocument createExcel() {
        return null;
    }
}
