package moneycalculator.model;

import java.util.ArrayList;

public class MoneyList extends ArrayList<Money> {

    public Money search(String token) {
        for (Money money : this) {
            if (token.equalsIgnoreCase(money.getCurrency().getName())) {
                return money;
            }
            if (token.equalsIgnoreCase(money.getCurrency().getCode())) {
                return money;
            }
            if (token.equalsIgnoreCase(money.getCurrency().getSymbol())) {
                return money;
            }

        }
        return null;
    }
}
