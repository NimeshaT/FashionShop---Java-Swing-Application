package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class DeleteOrderViewForm extends JFrame{

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

    private JButton btnDelete;

    public DeleteOrderViewForm(){

        setSize(400,500);
        setTitle("Delete Order Form");
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
        lblOrderId.setBounds(10,30,140,40);

        txtOrderId = new JTextField();
        txtOrderId.setFont(new Font("",Font.BOLD,15));
        txtOrderId.setBounds(150,40,140,30);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("",Font.BOLD,13));
        btnSearch.setBackground(Color.GREEN);
        btnSearch.setForeground(Color.white);
        btnSearch.setBounds(295,40,82,30);

        lblCustId = new JLabel("Customer ID :");
        lblCustId.setFont(new Font("",Font.BOLD,12));
        lblCustId.setBounds(15,100,150,40);

        txtCustId = new JTextField();
        txtCustId.setFont(new Font("",Font.BOLD,20));
        txtCustId.setEditable(false);
        txtCustId.setBounds(150,100,200,40);

        lblSize = new JLabel("Size :");
        lblSize.setFont(new Font("",Font.BOLD,12));
        lblSize.setBounds(15,150,150,40);

        txtSize = new JTextField();
        txtSize.setFont(new Font("",Font.BOLD,20));
        txtSize.setEditable(false);
        txtSize.setBounds(150,150,200,40);

        lblQty = new JLabel("Qty :");
        lblQty.setFont(new Font("",Font.BOLD,12));
        lblQty.setBounds(15,200,150,40);

        txtQty = new JTextField();
        txtQty.setFont(new Font("",Font.BOLD,20));
        txtQty.setEditable(false);
        txtQty.setBounds(150,200,200,40);

        lblAmount = new JLabel("Amount :");
        lblAmount.setFont(new Font("",Font.BOLD,12));
        lblAmount.setBounds(15,250,150,40);

        txtAmount = new JTextField();
        txtAmount.setFont(new Font("",Font.BOLD,20));
        txtAmount.setEditable(false);
        txtAmount.setBounds(150,250,200,40);

        lblStatus = new JLabel("Status :");
        lblStatus.setFont(new Font("",Font.BOLD,12));
        lblStatus.setBounds(15,300,150,40);

        txtStatus = new JTextField();
        txtStatus.setFont(new Font("",Font.BOLD,20));
        txtStatus.setEditable(false);
        txtStatus.setBounds(150,300,200,40);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("",Font.BOLD,12));
        btnDelete.setBackground(Color.red);
        btnDelete.setForeground(Color.white);
        btnDelete.setBounds(200,400,150,30);

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
        add(btnDelete);
    }
    
}
