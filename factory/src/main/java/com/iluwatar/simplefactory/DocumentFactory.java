package com.iluwatar.simplefactory;

/**
 * DocumentFactory
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/3
 */
public class DocumentFactory {
    public static IDocument Create(String documentType) {
        IDocument document = null;
        switch (documentType) {
            case "word":
                document = new WordDocument();
                break;
            case "excel":
                document = new ExcelDocument();
                break;
        }
        return document;
    }
}
