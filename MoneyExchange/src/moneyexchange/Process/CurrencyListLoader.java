package moneyexchange.Process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import moneyexchange.Model.Currency;
import moneyexchange.Model.CurrencyList;

public class CurrencyListLoader {

    private static CurrencyListLoader instance;

    public static CurrencyListLoader getInstance() {
        if (instance == null) {
            instance = new CurrencyListLoader();
        }
        return instance;
    }

    public CurrencyList loadFile(String language) throws FileNotFoundException, IOException {
        String Token;
        String[] Word;
        int i = 0;
        CurrencyList list = new CurrencyList();

        if (language.equalsIgnoreCase("en")) {
            FileReader en = new FileReader("currencies.en");
            BufferedReader bf = new BufferedReader(en);

            while ((Token = bf.readLine()) != null) {
                Word = Token.split(";");
                list.add(new Currency(Word[0], Word[1], Word[2]));
            }
        }

        if (language.equalsIgnoreCase("es")) {
            FileReader es = new FileReader("currencies.es");
            BufferedReader bf = new BufferedReader(es);

            while ((Token = bf.readLine()) != null) {
                Word = Token.split(";");
                list.add(new Currency(Word[0], Word[1], Word[2]));
            }
        }

        if (language.equalsIgnoreCase("fr")) {
            FileReader fr = new FileReader("currencies.fr");
            BufferedReader bf = new BufferedReader(fr);

            while ((Token = bf.readLine()) != null) {
                Word = Token.split(";");
                list.add(new Currency(Word[0], Word[1], Word[2]));
            }
        }

        if (language.equalsIgnoreCase("de")) {
            FileReader en = new FileReader("currencies.de");
            BufferedReader bf = new BufferedReader(en);

            while ((Token = bf.readLine()) != null) {
                Word = Token.split(";");
                list.add(new Currency(Word[0], Word[1], Word[2]));
            }
        }
        return list;
    }
}