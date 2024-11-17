package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;

import View.HomePageView;
import View.SearchCustomerForm;

public class SearchCustomerController extends JFrame{

    private SearchCustomerForm searchCustomer;
    private HomePageView home;

    public SearchCustomerController(SearchCustomerForm searchCustomer, HomePageView home){

        this.searchCustomer = searchCustomer;
        this.home = home;

        searchCustomer.getBtnBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                searchCustomer.dispose();
            }
        });
    }
    
}
