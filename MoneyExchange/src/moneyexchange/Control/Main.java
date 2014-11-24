
package moneyexchange.Control;

import java.io.FileNotFoundException;
import java.io.IOException;
import moneyexchange.Components.Frame;
import moneyexchange.Model.CurrencyList;
import moneyexchange.Process.CurrencyListLoader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       CurrencyListLoader file = new CurrencyListLoader();
       CurrencyList supportedCurrencyList = file.getInstance().loadFile("es");
       String[] values = supportedCurrencyList.toArray(CurrencyList.NAME);
       Frame moneyCalculatorFrame = new Frame(values);
       ExchangeCommand exchangeCommand = new ExchangeCommand(moneyCalculatorFrame.getMoneyDialogPanel(), moneyCalculatorFrame.getCurrencyListSelecctionDialogPanel(), moneyCalculatorFrame.getMoneyListViewerPanel(), supportedCurrencyList);
    }
}
