package moneyexchange.Control;

import java.io.FileNotFoundException;
import java.io.IOException;
import moneyexchange.Components.CurrencyListSelectionDialogPanel;
import moneyexchange.Components.MoneyDialogPanel;
import moneyexchange.Components.MoneyListViewerDialogPanel;
import moneyexchange.Input.CurrencyListSelectionDialog;
import moneyexchange.Input.MoneyDialog;
import moneyexchange.Model.CurrencyList;
import moneyexchange.Model.MoneyList;
import moneyexchange.Output.MoneyListViewerDialog;
import moneyexchange.Process.MoneyExchanger;

public class ExchangeCommand {

    private CurrencyList supportedCurrencyList;
    private MoneyDialog moneyDialog;
    private CurrencyListSelectionDialog currencyListSelectionDialog;
    private MoneyListViewerDialog moneyListViewerDialog;
    private MoneyListViewerDialogPanel moneyListViewerDialogPanel;
    private CurrencyListSelectionDialogPanel currencyListSelectionDialogPanel;
    private MoneyDialogPanel moneyDialogPanel;
    

    public ExchangeCommand(MoneyDialogPanel moneyDialogPanel, CurrencyListSelectionDialogPanel currencyListSelectionDialogPanel, MoneyListViewerDialogPanel moneyListViewerDialogPanel, CurrencyList supportedCurrencyList) {
        this.moneyListViewerDialogPanel = moneyListViewerDialogPanel;
        this.currencyListSelectionDialogPanel = currencyListSelectionDialogPanel;
        this.moneyDialogPanel = moneyDialogPanel;
        moneyDialog = new MoneyDialog(moneyDialogPanel, supportedCurrencyList);
       // currencyListSelectionDialog = new CurrencyListSelectionDialog(currencyListSelectionDialogPanel, supportedCurrencyList);
        
    }

    public void execute() throws FileNotFoundException, IOException {
        MoneyList moneyList = MoneyExchanger.exchange(moneyDialog.getMoney(), supportedCurrencyList);
        moneyListViewerDialog = new MoneyListViewerDialog(moneyList, moneyListViewerDialogPanel);
        moneyListViewerDialog.refresh();

    }
}
