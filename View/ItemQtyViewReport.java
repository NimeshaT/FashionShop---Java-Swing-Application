package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class ItemQtyViewReport extends JFrame{

    private JButton btnBack;

    private JTable tblItem;
    private DefaultTableModel dtm;
    private JScrollPane pane;

    public ItemQtyViewReport(){

        setSize(400,400);
        setTitle("Item By Qty Report");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        tblItem = new JTable();

        dtm = new DefaultTableModel();
        dtm.addColumn("Size");
        dtm.addColumn("Qty");
        dtm.addColumn("Amount");

        tblItem.setModel(dtm);

        pane = new JScrollPane(tblItem);
        pane.setBounds(10,50,360,150);

        add(btnBack);
        add(pane);
    }

    public JButton getBtnBack(){
        return btnBack;
    }
    
}
