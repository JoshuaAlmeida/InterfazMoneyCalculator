package moneycalculator.process;

import java.io.*;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencyList;

public class CurrencyListLoader {

    private static CurrencyListLoader instance;

    private CurrencyListLoader() {
    }

    public static CurrencyListLoader getInstance() {
        if (instance == null) {
            instance = new CurrencyListLoader();
        }
        return instance;
    }

    public CurrencyList load(String language) throws FileNotFoundException, IOException {
        String Token;
        String[] Word;
        CurrencyList list = new CurrencyList();
        if (language.equalsIgnoreCase("es")) {
            FileReader es = new FileReader("data/currencies_es.txt");
            BufferedReader bf = new BufferedReader(es);

            while ((Token = bf.readLine()) != null) {
                Word = Token.split(";");
                list.add(new Currency(Word[0], Word[1], Word[2]));
            }
        }

        return list;

    }
}
