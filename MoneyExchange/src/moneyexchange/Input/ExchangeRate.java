
package moneyexchange.Input;

import moneyexchange.Model.Currency;


public class ExchangeRate {
    private Currency currencySource;
    private Currency currencyDestiny;
    private double rate; 

    public ExchangeRate(Currency currencySource, Currency currencyDestiny, double rate) {
        this.currencySource = currencySource;
        this.currencyDestiny = currencyDestiny;
        this.rate = rate;
    }


    public Currency getCurrencyDestiny() {
        return currencyDestiny;
    }

    public Currency getCurrencySource() {
        return currencySource;
    }

    public double getRate() {
        return rate;
    }
    
}
