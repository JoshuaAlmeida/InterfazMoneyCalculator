
package moneyexchange.Model;


public class Currency {
    private String code;
    private String symbol;
    private String name;

    
    public Currency(String symbol, String name, String code) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCode() {
        return code;
    }
    
    
    
}
