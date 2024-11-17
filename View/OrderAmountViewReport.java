package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class OrderAmountViewReport extends JFrame{
    private JButton btnBack;

    private JTable tblAllOrder;
    private DefaultTableModel dtm;
    private JScrollPane pane;

    public OrderAmountViewReport(){

        setSize(400,400);
        setTitle("Order Report By Amount");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        tblAllOrder = new JTable();

        dtm = new DefaultTableModel();
        dtm.addColumn("Order ID");
        dtm.addColumn("CustomerID");
        dtm.addColumn("Size");
        dtm.addColumn("Qty");
        dtm.addColumn("Amount");
        dtm.addColumn("Status");

        tblAllOrder.setModel(dtm);

        pane = new JScrollPane(tblAllOrder);
        pane.setBounds(10,50,360,150);

        add(btnBack);
        add(pane);
    }
}
