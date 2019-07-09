package com.iluwatar.abstractfactory;

/**
 * OfficeFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class OfficeFactory implements IFactory {
    @Override
    public IWordDocument createWord() {
        return new WordDocument();
    }

    @Override
    public IExcelDocument createExcel() {
        return null;
    }
}
