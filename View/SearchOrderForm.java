package View;

import javax.swing.*;
import java.awt.*;

public class SearchOrderForm extends JFrame{
    
    private JButton btnBack;

    private JLabel lblOrderId;
    private JTextField txtOrderId;
    private JButton btnSearch;

    private JLabel lblCustId;
    private JLabel lblSize;
    private JLabel lblQty;
    private JLabel lblAmount;
    private JLabel lblStatus;

    private JTextField txtCustId;
    private JTextField txtSize;
    private JTextField txtQty;
    private JTextField txtAmount;
    private JTextField txtStatus;


    public SearchOrderForm(){

        setSize(400,400);
        setTitle("Search Order");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.white);
        btnBack.setBounds(0,0,100,30);

        lblOrderId = new JLabel("Enter Order ID:");
        lblOrderId.setFont(new Font("",Font.BOLD,15));
        lblOrderId.setBounds(10,30,130,40);

        txtOrderId = new JTextField();
        txtOrderId.setFont(new Font("",Font.BOLD,15));
        txtOrderId.setBounds(140,40,140,30);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("",Font.BOLD,13));
        btnSearch.setBackground(Color.green);
        btnSearch.setForeground(Color.white);
        btnSearch.setBounds(295,40,82,30);

        

        add(btnBack);
        add(lblOrderId);
        add(txtOrderId);
        add(btnSearch);
    }
}

