package com.iluwatar.factorymethod;

/**
 * DocumentXFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class DocumentXFactory implements IDocumentXFactory {
    @Override
    public IWordDocument createWordX() {
        return new WordXDocument();
    }

    @Override
    public IExcelDocument createExcelX() {
        return null;
    }
}
