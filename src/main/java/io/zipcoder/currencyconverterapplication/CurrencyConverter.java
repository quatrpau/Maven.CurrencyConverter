package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return (targetCurrencyType.getRate()/sourceCurrencyType.getCurrency().getRate()) * amountOfBaseCurrency;
    }
}
