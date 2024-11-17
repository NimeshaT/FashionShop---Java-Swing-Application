package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class AllCustomerViewForm extends JFrame{

    private JButton btnBack;

    private JTable tblAllCust;
    private DefaultTableModel dtm;
    private JScrollPane scrollPane;

    public AllCustomerViewForm(){

        setSize(500,400);
        setTitle("All Customer Report");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        tblAllCust = new JTable();

        dtm = new DefaultTableModel();
        dtm.addColumn("CustomerID");
        dtm.addColumn("XS");
        dtm.addColumn("S");
        dtm.addColumn("M");
        dtm.addColumn("L");
        dtm.addColumn("XL");
        dtm.addColumn("XXL");

        tblAllCust.setModel(dtm);

        scrollPane = new JScrollPane(tblAllCust);
        scrollPane.setBounds(10,50,460,140);

        add(btnBack);
        add(scrollPane);
    }
    
}
