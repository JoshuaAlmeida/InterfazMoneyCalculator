
package moneyexchange.Process;

import java.io.FileNotFoundException;
import java.io.IOException;
import moneyexchange.Input.ExchangeRate;
import moneyexchange.Model.Currency;
import moneyexchange.Model.CurrencyList;
import moneyexchange.Model.Money;
import moneyexchange.Model.MoneyList;


public class MoneyExchanger {
    
    private static Iterable<Currency> CurrencyList;
    
    public static Money exchange(Money money, Currency currency) throws FileNotFoundException, IOException{
        ExchangeRateLoader exchangeRateloader = new ExchangeRateLoader();
        ExchangeRate exchangeRate = exchangeRateloader.getInstance().load(money.getCurrency(), currency);
        return new Money(money.getAmount() * exchangeRate.getRate(),currency);
    }
    
    public static MoneyList exchange(Money money, CurrencyList currencyList) throws FileNotFoundException, IOException{
        MoneyList list = new MoneyList();
        for(Currency currency: CurrencyList){
            list.add(exchange(money,currency));
        }
        return list;
    }
}
