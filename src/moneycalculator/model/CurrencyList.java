package moneycalculator.model;

import java.util.ArrayList;

public class CurrencyList extends ArrayList<Currency> {

    public static final int NAME = 0;
    public static final int CODE = 1;
    public static final int SYMBOL = 2;

    public Currency search(String token) {
        if (token.isEmpty()) {
            return null;
        }
        for (Currency currency : this) {

            if (token.equalsIgnoreCase(currency.getCode())) {
                return currency;
            }
            if (token.equalsIgnoreCase(currency.getName())) {
                return currency;
            }
            if (token.equals(currency.getSymbol())) {
                return currency;
            }
        }
        return null;
    }

    public String[] toArray(int field) {
        String[] result = new String[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = (field == NAME) ? get(i).getCode() : (field == CODE) ? get(i).getName() : get(i).getSymbol();
        }
        return result;
    }
}
