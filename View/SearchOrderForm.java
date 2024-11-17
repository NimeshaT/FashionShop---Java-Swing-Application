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

        lblCustId = new JLabel("Customer ID:");
        lblCustId.setFont(new Font("",Font.BOLD,15));
        lblCustId.setBounds(10,100,130,40);

        txtCustId = new JTextField();
        txtCustId.setFont(new Font("",Font.BOLD,15));
        txtCustId.setBounds(140,110,140,30);

        lblSize = new JLabel("Size :");
        lblSize.setFont(new Font("",Font.BOLD,15));
        lblSize.setBounds(10,140,130,40);

        txtSize = new JTextField();
        txtSize.setFont(new Font("",Font.BOLD,15));
        txtSize.setBounds(140,150,140,30);

        lblQty = new JLabel("Qty :");
        lblQty.setFont(new Font("",Font.BOLD,15));
        lblQty.setBounds(10,180,130,40);

        txtQty = new JTextField();
        txtQty.setFont(new Font("",Font.BOLD,15));
        txtQty.setBounds(140,190,140,30);

        lblAmount = new JLabel("Amount :");
        lblAmount.setFont(new Font("",Font.BOLD,15));
        lblAmount.setBounds(10,220,130,40);

        txtAmount = new JTextField();
        txtAmount.setFont(new Font("",Font.BOLD,15));
        txtAmount.setBounds(140,230,140,30);

        lblStatus = new JLabel("Status :");
        lblStatus.setFont(new Font("",Font.BOLD,15));
        lblStatus.setBounds(10,260,130,40);

        txtStatus = new JTextField();
        txtStatus.setFont(new Font("",Font.BOLD,15));
        txtStatus.setBounds(140,270,140,30);

        add(btnBack);
        add(lblOrderId);
        add(txtOrderId);
        add(btnSearch);
        add(lblCustId);
        add(txtCustId);
        add(lblSize);
        add(txtSize);
        add(lblQty);
        add(txtQty);
        add(lblAmount);
        add(txtAmount);
        add(lblStatus);
        add(txtStatus);
    }

    public JButton getBtnBack(){
        return btnBack;
    }

    public JTextField getTxtOrderId(){
        return txtOrderId;
    }

    public JTextField getTxtCustId(){
        return txtCustId;
    }

    public JTextField getTxtSize(){
        return txtSize;
    }

    public JTextField getTxtQty(){
        return txtQty;
    }

    public JTextField getTxtAmount(){
        return txtAmount;
    }

    public JTextField getTxtStatus(){
        return txtStatus;
    }
}

