package View;

import javax.swing.*;
import java.awt.*;

public class AddCustomerForm extends JFrame {
    
    private JButton btnBack;

    private JLabel lblOrderId;
    private JLabel lblCustId;
    private JLabel lblSize;
    private JLabel lblQty;
    private JLabel lblAmount;

    private JTextField txtOrderId;
    private JTextField txtCustId;
    private JTextField txtSize;
    private JTextField txtQty;
    private JTextField txtAmount;

    private JButton btnPlaceOrder;

    public AddCustomerForm(){

        setSize(400, 400);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.white);
        btnBack.setBounds(0,0,100,40);

        lblOrderId = new JLabel("Order ID :");
        lblOrderId.setFont(new Font("",Font.BOLD,20));
        lblOrderId.setBounds(15,50,150,40);

        txtOrderId = new JTextField();
        txtOrderId.setFont(new Font("",Font.BOLD,20));
        txtOrderId.setEditable(false);
        txtOrderId.setBounds(150,50,200,40);

        lblCustId = new JLabel("Customer ID :");
        lblCustId.setFont(new Font("",Font.BOLD,20));
        lblCustId.setBounds(15,100,150,40);

        txtCustId = new JTextField();
        txtCustId.setFont(new Font("",Font.BOLD,20));
        txtCustId.setBounds(150,100,200,40);

        lblSize = new JLabel("Size :");
        lblSize.setFont(new Font("",Font.BOLD,20));
        lblSize.setBounds(15,150,150,40);

        txtSize = new JTextField();
        txtSize.setFont(new Font("",Font.BOLD,20));
        txtSize.setBounds(150,150,200,40);

        lblQty = new JLabel("Qty :");
        lblQty.setFont(new Font("",Font.BOLD,20));
        lblQty.setBounds(15,200,150,40);

        txtQty = new JTextField();
        txtQty.setFont(new Font("",Font.BOLD,20));
        txtQty.setBounds(150,200,200,40);

        lblAmount = new JLabel("Amount :");
        lblAmount.setFont(new Font("",Font.BOLD,20));
        lblAmount.setBounds(15,250,150,40);

        txtAmount = new JTextField();
        txtAmount.setFont(new Font("",Font.BOLD,20));
        txtAmount.setEditable(false);
        txtAmount.setBounds(150,250,200,40);

        btnPlaceOrder = new JButton("Place");
        btnPlaceOrder.setFont(new Font("",Font.BOLD,20));
        btnPlaceOrder.setBackground(Color.GREEN);
        btnPlaceOrder.setForeground(Color.white);
        btnPlaceOrder.setBounds(200,300,150,40);

        add(btnBack);
        add(lblOrderId);
        add(txtOrderId);
        add(lblCustId);
        add(txtCustId);
        add(lblSize);
        add(txtSize);
        add(lblQty);
        add(txtQty);
        add(lblAmount);
        add(txtAmount);
        add(btnPlaceOrder);
    }
}
