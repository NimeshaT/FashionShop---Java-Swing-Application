package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class BestInCustomerViewForm extends JFrame{
    
    private JButton btnBack;

    private JTable tblBestInCustomer;
    private DefaultTableModel dtm;
    private JScrollPane tblScrollPane;

    public BestInCustomerViewForm(){

        setSize(400,400);
        setTitle("Best In Customer Report");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        tblBestInCustomer = new JTable();
        dtm = new DefaultTableModel();
        dtm.addColumn("CustomerID");
        dtm.addColumn("Qty");
        dtm.addColumn("Amount");

        tblBestInCustomer.setModel(dtm);

        tblScrollPane = new JScrollPane(tblBestInCustomer);
        tblScrollPane.setBounds(10,50,360,150);

        add(btnBack);
        add(tblScrollPane);

    }

    public JButton getBtnBack(){
        return btnBack;
    }
}
