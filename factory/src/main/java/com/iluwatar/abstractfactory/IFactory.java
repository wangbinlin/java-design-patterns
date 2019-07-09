package com.iluwatar.abstractfactory;

public interface IFactory {
   IWordDocument createWord();
   IExcelDocument createExcel();
}
