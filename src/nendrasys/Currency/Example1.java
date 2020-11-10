package nendrasys.Currency;

import java.util.Currency;
import java.util.Locale;

public class Example1
{

    public static void main(String[] args) {
        Currency currency=Currency.getInstance("INR");

        System.out.println("Current code "+currency.getCurrencyCode());
        System.out.println("Currency symbol"+currency.getSymbol());
        System.out.println("CUrrency numberic code"+currency.getNumericCode());


        System.out.println("10"+currency);

    }
}
