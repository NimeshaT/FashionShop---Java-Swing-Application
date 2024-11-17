package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class ViewForm extends JFrame{
    
    private JButton btnBack;

    private JButton btnViewCust;
    private JButton btnBestInCust;
    private JButton btnAllCust;

    private JButton btnByQty;
    private JButton btnByAmount;

    private JButton btnOdrByAmount;
    private JButton btnAllOrders;


    public ViewForm(){

        setSize(650,400);
        setTitle("View Customer Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("",Font.BOLD,20));
        btnBack.setBackground(Color.RED);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(0,0,100,30);

        btnViewCust = new JButton("View Customers");
        btnViewCust.setFont(new Font("",Font.BOLD,14));
        btnViewCust.setBackground(Color.green);
        btnViewCust.setForeground(Color.WHITE);
        btnViewCust.setBounds(20,50,180,30);

        btnBestInCust = new JButton("Best In Customers");
        btnBestInCust.setFont(new Font("",Font.BOLD,14));
        btnBestInCust.setBackground(Color.green);
        btnBestInCust.setForeground(Color.WHITE);
        btnBestInCust.setBounds(20,100,180,30);

        btnAllCust = new JButton("All Customers");
        btnAllCust.setFont(new Font("",Font.BOLD,14));
        btnAllCust.setBackground(Color.green);
        btnAllCust.setForeground(Color.WHITE);
        btnAllCust.setBounds(20,150,180,30);


        btnByQty = new JButton("Categorized By Qty");
        btnByQty.setFont(new Font("",Font.BOLD,14));
        btnByQty.setBackground(Color.blue);
        btnByQty.setForeground(Color.WHITE);
        btnByQty.setBounds(220,50,200,30);

        btnByAmount = new JButton("Categorized By Amount");
        btnByAmount.setFont(new Font("",Font.BOLD,14));
        btnByAmount.setBackground(Color.BLUE);
        btnByAmount.setForeground(Color.WHITE);
        btnByAmount.setBounds(220,100,200,30);


        btnOdrByAmount = new JButton("Orders By Amount");
        btnOdrByAmount.setFont(new Font("",Font.BOLD,14));
        btnOdrByAmount.setBackground(Color.gray);
        btnOdrByAmount.setForeground(Color.WHITE);
        btnOdrByAmount.setBounds(440,50,180,30);

        btnAllOrders = new JButton("All Orders");
        btnAllOrders.setFont(new Font("",Font.BOLD,14));
        btnAllOrders.setBackground(Color.gray);
        btnAllOrders.setForeground(Color.WHITE);
        btnAllOrders.setBounds(440,100,180,30);

        add(btnBack);
        add(btnViewCust);
        add(btnBestInCust);
        add(btnAllCust);
        add(btnByQty);
        add(btnByAmount);
        add(btnOdrByAmount);
        add(btnAllOrders);
    }

    public JButton getBtnBack(){
        return btnBack;
    }

    public JButton getBtnViewCust(){
        return btnViewCust;
    }

    public JButton getBtnBestInCust(){
        return btnBestInCust;
    }

    public JButton getBtnAllCust(){
        return btnAllCust;
    }

    public JButton getBtnByQty(){
        return btnByQty;
    }

    public JButton getBtnByAmount(){
        return btnByAmount;
    }

    public JButton getBtnOrderByAmount(){
        return btnOdrByAmount;
    }

    public JButton getBtnAllOrders(){
        return btnAllOrders;
    }

    
}
