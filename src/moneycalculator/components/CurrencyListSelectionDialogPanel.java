package moneycalculator.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CurrencyListSelectionDialogPanel extends JPanel {

    private JButton addButton;
    private String[] values;
    private ArrayList<CurrencyPanel> currencies;

    public CurrencyListSelectionDialogPanel(String[] values) {
        super();
        this.currencies = new ArrayList<CurrencyPanel>();
        this.values = values;
        this.setLayout(new FlowLayout());
        createComponents();
    }

    private void createComponents() {
        createAddButton();
    }

    private void createAddButton() {
        addButton = new JButton();
        addIcon();
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                createCurrencyPanel();
            }
        });
    }

    private void createCurrencyPanel() {
        final CurrencyPanel panel = new CurrencyPanel(values);
        panel.setRemoveAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeCurrencyPanel(panel);
            }
        });
        this.currencies.add(panel);
        refresh();
    }

    private void removeCurrencyPanel(CurrencyPanel panel) {
        currencies.remove(panel);
        refresh();
    }

    public void refresh() {
        this.removeAll();
        for (CurrencyPanel panel : currencies) {
            this.add(panel);
        }
        this.add(addButton);
        this.revalidate();
    }

    public ArrayList<String> getCurrencies() {
        ArrayList<String> list = new ArrayList<String>();
        for (CurrencyPanel ris : currencies) {
            list.add(ris.getCurrencys());
        }
        return list;
    }

    public void addIcon() {
        addButton.setIcon(new ImageIcon("icons/addfilebutton.png"));
    }
}
