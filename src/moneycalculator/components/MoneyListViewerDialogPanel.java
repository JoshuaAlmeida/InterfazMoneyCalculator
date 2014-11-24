package moneycalculator.components;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoneyListViewerDialogPanel extends JPanel {

    private JLabel label;

    public MoneyListViewerDialogPanel() {
        add(createLabel());
    }

    private JLabel createLabel() {
        label = new JLabel();
        return label;
    }

    public void setText(String text) {
        label.setText(text);
    }
}
