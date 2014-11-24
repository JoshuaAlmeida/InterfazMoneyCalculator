
package moneyexchange.Components;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoneyListViewerDialogPanel extends JPanel{
    private JLabel[] amounts;
       
    public MoneyListViewerDialogPanel (){
        super();
        this.setLayout(new FlowLayout());
        createAmounts();
    }

    
    private void createAmounts(){
        amounts = new JLabel[5];
    }

    public void setAmount(String amount, int position) {
        amounts[position].setText(amount);
        for(int i=position+1;i<5;i++){
            amounts[i].setText("");
        }
    }
    
}
