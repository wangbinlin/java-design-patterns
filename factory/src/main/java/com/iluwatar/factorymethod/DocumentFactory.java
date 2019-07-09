package com.iluwatar.factorymethod;

/**
 * DocumentFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class DocumentFactory implements IDocumentFactory  {
    @Override
    public IWordDocument createWord() {
        return new WordDocument();
    }

    @Override
    public IExcelDocument createExcel() {
        return null ;
    }
}
