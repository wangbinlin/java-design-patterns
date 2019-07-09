package com.iluwatar.factorymethod;

public interface IDocumentXFactory {
    IWordDocument createWordX();
    IExcelDocument createExcelX();
}
