package moneyexchange.Components;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MoneyDialogPanel extends JPanel{
    
    private JTextField amount;
    private JComboBox currency;
    
    public MoneyDialogPanel (String[] values){
        super();
        this.setLayout(new FlowLayout());
        createComponents(values);
    }

    private void createComponents(String[] values) {
        add(createAmount());
        add(createCurrency(values));
    }
    
    private JTextField createAmount(){
        amount = new JTextField();
        amount.setColumns(5);
        return amount;
    }
    
    private JComboBox createCurrency(String[] values){
        currency = new JComboBox(values);
        return currency;
    }

    public String getAmount() {
        return amount.getText();
    }

    public String getCurrency() {
        return (String) currency.getSelectedItem();
    }
    
}
