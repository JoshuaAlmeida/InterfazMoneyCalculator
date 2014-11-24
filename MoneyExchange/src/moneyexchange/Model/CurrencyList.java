package moneyexchange.Model;

import java.util.ArrayList;

public class CurrencyList extends ArrayList<Currency>{
    
    public static final int CODE = 0;
    public static final int NAME = 1;
    public static final int SYMBOL = 2;
            
    public Currency search (String token){
        
        for (Currency currency : this){
            if (token.equalsIgnoreCase(currency.getName()))
                return currency;
            if(token.equalsIgnoreCase(currency.getSymbol()))
                return currency;
            if(token.equalsIgnoreCase(currency.getCode()))
                return currency;
        }
        return null;
    }
    
    public String[] toArray(int field){
        String[] result = new String[size()];
        for (int i=0;i<size();i++)
            result[i] = (field == CODE) ? get(i).getCode() : (field == NAME) ? get(i).getName() : get(i).getSymbol();
        return result;
    }
}
