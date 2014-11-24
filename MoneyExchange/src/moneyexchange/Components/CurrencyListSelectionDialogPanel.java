package moneyexchange.Components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CurrencyListSelectionDialogPanel extends JPanel {

    private JButton moreCurrencies;
    private String[] values;
    private ArrayList<String> addedCurrencies;

    public CurrencyListSelectionDialogPanel(String[] values) {
        super();
        this.setLayout(new FlowLayout());
        this.values = values;
        this.addedCurrencies = null;
        moreCurrencies = new JButton("Nueva Moneda");
        add(moreCurrencies);
        moreCurrencies.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                createAddedCurrencyPanel();
            }
        });

    }

    public void createAddedCurrencyPanel() {
        AddedCurrencyPanel panel = new AddedCurrencyPanel(values, addedCurrencies);
        addedCurrencies.add(panel.getCurrency());
        this.add(panel);
    }

    public ArrayList<String> getAddedCurrencies() {
        return addedCurrencies;
    }
    
    
}
