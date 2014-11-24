package moneycalculator.components;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CurrencyPanel extends JPanel {

    private JButton remove;
    private JComboBox currency;
    private ArrayList<String> result;

    public CurrencyPanel(String[] values) {
        super();
        this.setLayout(new GridLayout(2, 1));
        result = new ArrayList<String>();
        createComponents(values);

    }

    private void createComponents(String[] values) {
        add(createCurrency(values));
        add(createRemoveButton());
    }

    private JComboBox createCurrency(String[] values) {
        currency = new JComboBox(values);
        currency.setSize(100, 300);
        return currency;
    }

    private JButton createRemoveButton() {
        remove = new JButton();
        addIcon();
        return remove;
    }

    public void setRemoveAction(ActionListener listener) {
        remove.addActionListener(listener);
    }

    public String getCurrencys() {
        return (String) currency.getSelectedItem();
    }

    public void addIcon() {
        remove.setIcon(new ImageIcon("icons/eliminar.gif"));
    }
}