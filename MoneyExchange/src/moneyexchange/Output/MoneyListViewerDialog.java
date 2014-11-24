package moneyexchange.Output;

import moneyexchange.Components.MoneyListViewerDialogPanel;
import moneyexchange.Model.Money;
import moneyexchange.Model.MoneyList;


public class MoneyListViewerDialog {
    private MoneyList moneyList;
    private MoneyListViewerDialogPanel moneyListViewerDialogPanel;

    public MoneyListViewerDialog (MoneyList moneyList, MoneyListViewerDialogPanel moneyListViewerDialogPanel) {
        this.moneyListViewerDialogPanel = moneyListViewerDialogPanel;
        this.moneyList = moneyList;
    }
    
    public void setMoneyList(MoneyList moneyList) {
        this.moneyList = moneyList;
    }
    
    public void refresh(){
        for (Money money : moneyList)
            moneyListViewerDialogPanel.setAmount(money.getAmount() + " " + money.getCurrency().getSymbol() , moneyList.indexOf(money));
    }
    
    
}
