package moneyexchange.Components;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class AddedCurrencyPanel extends JPanel {

    private JButton deleteCurrency;
    private JComboBox currency;
    private final ArrayList<String> addedCurrencies;

    AddedCurrencyPanel(String[] values, ArrayList<String> addedCurrencies) {
        super();
        this.setLayout(new GridLayout(2, 1));
        createComponents(values);
        this.addedCurrencies = addedCurrencies;
    }

    private void createComponents(String[] values) {
        add(createButton());
        add(createCurrency(values));
        addedCurrencies.add("dollar");
    }

    private JButton createButton() {
        deleteCurrency = new JButton("Borrar Divisa");
        deleteCurrency.addActionListener(new ActionListener() {
       // String string = getCurrency();
            @Override
            public void actionPerformed(ActionEvent ae) {
                addedCurrencies.remove("dollar");
                removeAll();
            }
        });
        return deleteCurrency;
    }

    private JComboBox createCurrency(String[] values) {
        currency = new JComboBox(values);
        return currency;
    }


    public String getCurrency() {
        return (String) currency.getSelectedItem();
    }
    
}
