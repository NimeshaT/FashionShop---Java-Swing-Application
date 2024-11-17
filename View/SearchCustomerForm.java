package View;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;

public class SearchCustomerForm extends JFrame{
    
    private JButton btnBack;

    private JLabel lblCustId;
    private JTextField txtCustId;
    private JButton btnSearch;

    private JTable tblCustomer;
    private DefaultTableModel dtm;
    private JScrollPane tblScrollPane;

    private JLabel lblTotal;
    private JTextField txtTotal;


    public SearchCustomerForm(){

        setSize(400,400);
        setTitle("Search Customer");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.white);
        btnBack.setBounds(0,0,100,30);

        lblCustId = new JLabel("Enter Customer ID:");
        lblCustId.setFont(new Font("",Font.BOLD,15));
        lblCustId.setBounds(10,30,140,40);

        txtCustId = new JTextField();
        txtCustId.setFont(new Font("",Font.BOLD,15));
        txtCustId.setBounds(150,40,140,30);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("",Font.BOLD,13));
        btnSearch.setBackground(Color.GREEN);
        btnSearch.setForeground(Color.white);
        btnSearch.setBounds(295,40,82,30);

        tblCustomer = new JTable();
        dtm = new DefaultTableModel();
        dtm.addColumn("Size");
        dtm.addColumn("Qty");
        dtm.addColumn("Amount");

        tblCustomer.setModel(dtm);

        tblScrollPane = new JScrollPane(tblCustomer);
        tblScrollPane.setBounds(10,100,360,150);
        
        lblTotal = new JLabel("Total :");
        lblTotal.setFont(new Font("",Font.BOLD,15));
        lblTotal.setBounds(10,300,140,40);

        txtTotal = new JTextField();
        txtTotal.setFont(new Font("",Font.BOLD,15));
        txtTotal.setBounds(295,300,82,30);



        add(btnBack);
        add(lblCustId);
        add(txtCustId);
        add(btnSearch);
        add(tblScrollPane);
        add(lblTotal);
        add(txtTotal);
    }

    public JButton getBtnBack(){
        return btnBack;
    }

    public JTextField getTxtCustId(){
        return txtCustId;
    }

    public JTextField getTxtTotal(){
        return txtTotal;
    }
}
