package View;

import javax.swing.*;
import java.awt.*;


public class HomePageView extends JFrame{

    private JLabel lblTitle;
    private JLabel lblImage;

    private JButton btnSearch;
    private JButton btnStatus;
    private JButton btnReport;
    private JButton btnDelete;

    private JButton btnPlaceOrder;

    public HomePageView(){

        setSize(400,400);
        setTitle("Fashio Shop");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        lblTitle = new JLabel("Fashion Shop");
        lblTitle.setFont(new Font("",Font.BOLD,20));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);
        lblTitle.setBackground(Color.BLUE);
        lblTitle.setForeground(Color.white);
        lblTitle.setBounds(0,0,400,40);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("",Font.BOLD,20));
        btnSearch.setBounds(40,60,160,40);

        btnStatus = new JButton("Status");
        btnStatus.setFont(new Font("",Font.BOLD,20));
        btnStatus.setBounds(40,120,160,40);

        btnReport = new JButton("Reports");
        btnReport.setFont(new Font("",Font.BOLD,20));
        btnReport.setBounds(40,180,160,40);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("",Font.BOLD,20));
        btnDelete.setBounds(40,240,160,40);

        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("",Font.BOLD,20));
        btnPlaceOrder.setBounds(40,300,160,50);
        btnPlaceOrder.setBackground(Color.GREEN);

        ImageIcon icon = new ImageIcon("View/image/homeImage.JPG");

        Image image = icon.getImage().getScaledInstance(200, 360, Image.SCALE_SMOOTH);
        ImageIcon scaledImage = new ImageIcon(image);

        lblImage = new JLabel(scaledImage);
        lblImage.setBounds(200,40,200,360);

        add(lblTitle);
        add(btnSearch);
        add(btnStatus);
        add(btnReport);
        add(btnDelete);
        add(btnPlaceOrder);
        add(lblImage);
    }


    public JButton getBtnPlaceOrder(){
        return btnPlaceOrder;
    }

}