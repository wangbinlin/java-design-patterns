package com.iluwatar.factorymethod;

public interface IDocumentFactory  {
    IWordDocument createWord();
    IExcelDocument createExcel();
}
