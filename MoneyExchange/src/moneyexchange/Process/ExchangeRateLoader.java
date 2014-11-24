package moneyexchange.Process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import moneyexchange.Input.ExchangeRate;
import moneyexchange.Model.Currency;

public class ExchangeRateLoader {

    private static ExchangeRateLoader instance;

    public static ExchangeRateLoader getInstance() {
        if (instance == null) {
            instance = new ExchangeRateLoader();
        }
        return instance;
    }

    public ExchangeRate load(Currency currencySource, Currency currencyDestiny) throws FileNotFoundException, IOException {
        double rate = 0.0;
        String Token;
        String[] Word;
        FileReader fileReader = new FileReader("Rates");
        BufferedReader bf = new BufferedReader(fileReader);


        while ((Token = bf.readLine()) != null) {
            Word = Token.split(";");
            if (currencySource.getCode().equals(Word[0]) && currencyDestiny.getCode().equals(Word[1])) {
                rate = Double.valueOf(Word[2]).doubleValue();
                return new ExchangeRate(currencySource, currencyDestiny, rate);
            }
        }
        return new ExchangeRate(currencySource, currencyDestiny, rate);

    }
}
