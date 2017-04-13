package com.google.android.gms.samples.vision.ocrreader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Danny Chianglin on 4/9/2017.
 */

public  class CurrencyRate {
    public double EURO=  0.94;
    public double USD = 1.00;
    public double CAD = 1.34;
    public double YEN = 111.08;
    public static Map<String, Double> currencies;

    public CurrencyRate() {
        currencies = new HashMap<>();
        currencies.put("EURO", Double.valueOf(0.94));
        currencies.put("USD", Double.valueOf(1.00));
        currencies.put("CAD", Double.valueOf(1.34));
        currencies.put("YEN", Double.valueOf(111.08));
    }

    public static double convertCurrency(double money, String from, String to) {
        double rateFrom = currencies.get(from);
        double rateTo   = currencies.get(to);

        return money * (rateTo/rateFrom);

    }
}
