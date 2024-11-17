package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.HomePageView;
import View.SearchOrderForm;

import java.awt.event.*;

public class SearchOrderController extends JFrame{

    private SearchOrderForm searchOrder;
    private HomePageView home;

    public SearchOrderController(SearchOrderForm searchOrder, HomePageView home){

        this.searchOrder = searchOrder;
        this.home = home;

        searchOrder.getBtnBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                searchOrder.dispose();
            }
        });

    }
    
}
