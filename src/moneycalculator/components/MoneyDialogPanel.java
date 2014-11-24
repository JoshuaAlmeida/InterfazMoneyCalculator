package moneycalculator.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyDialogPanel extends JPanel {

    private JTextField amount;
    private JComboBox currency;

    public MoneyDialogPanel(String[] values) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        createComponents(values);
        setMaximumSize(new Dimension(400, 50));
    }

    private void createComponents(String[] values) {
        add(createAmount());
        add(createCurrency(values));
    }

    private JTextField createAmount() {
        amount = new JTextField();
        controlTextField();
        amount.setFont(new Font("Arial", Font.PLAIN, 18));
        amount.setPreferredSize(new Dimension(210, 40));
        amount.setHorizontalAlignment(JTextField.RIGHT);
        amount.setText("0.0");
        return amount;
    }

    private JComboBox createCurrency(String[] values) {
        currency = new JComboBox(values);
        currency.setFont(new Font("Arial", Font.PLAIN, 18));
        currency.setSelectedItem("EUR");
        currency.setPreferredSize(new Dimension(180, 40));
        return currency;
    }

    public double getAmount() {
        return Double.valueOf(amount.getText());
    }

    public String getCurrency() {
        return (String) currency.getSelectedItem();
    }

    private void controlTextField() {
        amount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char carac = e.getKeyChar();
                if (carac < '0' || carac > '9') {
                    e.consume();
                }
            }
        });
    }
}
