package moneyexchange.Input;

import java.util.ArrayList;
import moneyexchange.Components.CurrencyListSelectionDialogPanel;
import moneyexchange.Model.CurrencyList;

public class CurrencyListSelectionDialog {

    private CurrencyList supportedCurrencyList;
    private CurrencyListSelectionDialogPanel currencyListSelectionDialogPanel;
    private CurrencyList outList;

    public CurrencyListSelectionDialog(CurrencyListSelectionDialogPanel currencyListSelectionDialogPanel, CurrencyList supportedCurrencyList) {
        this.supportedCurrencyList = supportedCurrencyList;
        this.currencyListSelectionDialogPanel = currencyListSelectionDialogPanel;
        System.out.println(currencyListSelectionDialogPanel.getAddedCurrencies().toString());
        createCurrencyList(currencyListSelectionDialogPanel.getAddedCurrencies());
    }

    public CurrencyList createCurrencyList(ArrayList<String> addedCurrencies) {
        outList = null;
        for (int i = 0; i < addedCurrencies.size(); i++) {
            outList.add(supportedCurrencyList.search(addedCurrencies.get(i)));
        }
        return outList;
    }

    public CurrencyList getOutList() {
        return outList;
    }
}
