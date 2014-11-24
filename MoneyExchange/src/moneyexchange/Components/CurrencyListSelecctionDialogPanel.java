package moneyexchange.Components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CurrencyListSelecctionDialogPanel extends JPanel {

    private JButton moreCurrencies;
    private String[] values;

    public CurrencyListSelecctionDialogPanel(String[] values) {
        super();
        this.setLayout(new FlowLayout());
        this.values = values;
        moreCurrencies = new JButton("Nueva Moneda");
        add(moreCurrencies);
        moreCurrencies.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                createAddedCurrencyPanel();
            }
        });

    }

    private void createAddedCurrencyPanel() {
     //   this.add(new AddedCurrencyPanel(values));
    }
}
