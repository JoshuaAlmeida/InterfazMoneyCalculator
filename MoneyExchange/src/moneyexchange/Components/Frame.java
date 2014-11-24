package moneyexchange.Components;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Frame extends JFrame {

    private MoneyDialogPanel moneyDialogPanel;
    private MoneyListViewerDialogPanel moneyListViewerPanel;
    private CurrencyListSelectionDialogPanel currencyListSelecctionDialogPanel;

    public Frame(String[] values) {
        super();
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 500);
        setVisible(true);
        createComponents(values);
    }

    private void createComponents(String[] values) {
        Container container = getContentPane();
        this.setLayout(new BoxLayout(container, 4));
        container.add(createMoneyDialogPanel(values));
        container.add(createCurrencyListSelectionDialogPanel(values));
        container.add(createMoneyListViewerPanel());
    }

    private MoneyDialogPanel createMoneyDialogPanel(String[] values) {
        moneyDialogPanel = new MoneyDialogPanel(values);
        return moneyDialogPanel;
    }

    private CurrencyListSelectionDialogPanel createCurrencyListSelectionDialogPanel(String[] values) {
        currencyListSelecctionDialogPanel = new CurrencyListSelectionDialogPanel(values);
        return currencyListSelecctionDialogPanel;
    }

    private MoneyListViewerDialogPanel createMoneyListViewerPanel() {
        moneyListViewerPanel = new MoneyListViewerDialogPanel();
        return moneyListViewerPanel;
    }

    public CurrencyListSelectionDialogPanel getCurrencyListSelecctionDialogPanel() {
        return currencyListSelecctionDialogPanel;
    }

    public MoneyDialogPanel getMoneyDialogPanel() {
        return moneyDialogPanel;
    }

    public MoneyListViewerDialogPanel getMoneyListViewerPanel() {
        return moneyListViewerPanel;
    }
}
