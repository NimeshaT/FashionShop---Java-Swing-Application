package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class CustomerViewForm extends JFrame{

    private JButton btnBack;

    private JTable tblCust;
    private DefaultTableModel dtm;
    private JScrollPane pane;

    public CustomerViewForm(){

        setSize(400,400);
        setTitle("Customer Report");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        tblCust = new JTable();

        dtm = new DefaultTableModel();
        dtm.addColumn("Customer ID");
        dtm.addColumn("Qty");
        dtm.addColumn("Amount");

        tblCust.setModel(dtm);

        pane = new JScrollPane(tblCust);
        pane.setBounds(10,50,360,150);

        add(btnBack);
        add(pane);

    }

    public JButton getBtnBack(){
        return btnBack;
    }
    
}
