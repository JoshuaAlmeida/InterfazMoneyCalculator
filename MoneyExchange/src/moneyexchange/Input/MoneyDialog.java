
package moneyexchange.Input;

import moneyexchange.Components.MoneyDialogPanel;
import moneyexchange.Model.CurrencyList;
import moneyexchange.Model.Money;

public class MoneyDialog {
    
  private CurrencyList supportedCurrencyList;
  private MoneyDialogPanel moneyDialogPanel;

    public MoneyDialog(MoneyDialogPanel moneyDialogPanel, CurrencyList supportedCurrencyList) {

        this.moneyDialogPanel = moneyDialogPanel;
    }
  public Money getMoney(){
      Money money = new Money(Double.valueOf(moneyDialogPanel.getAmount()),supportedCurrencyList.search(moneyDialogPanel.getCurrency()));
      return money;
  }

}
