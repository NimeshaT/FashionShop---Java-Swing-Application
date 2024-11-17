package Controller;

import View.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class HomePageController {
    
    private AddCustomerForm addCustomer;
    private HomePageView home;
    private SearchCustomerForm searchCustomer;
    private SearchOrderForm searchOrder;
    private ChangeOrderStatusViewForm changeStatus;
    private ViewForm form;
    private DeleteOrderViewForm deleteForm;
    //private AllCustomerViewForm allCustForm;

    public HomePageController(HomePageView home,AddCustomerForm addCustomer, SearchCustomerForm searchCustomer, SearchOrderForm searchOrder, ChangeOrderStatusViewForm changeStatus, ViewForm form, DeleteOrderViewForm deleteForm){

        this.addCustomer = addCustomer;
        this.home = home;
        this.searchCustomer=searchCustomer;
        this.searchOrder = searchOrder;
        this.changeStatus = changeStatus;
        this.form = form;
        this.deleteForm = deleteForm;
        //this.allCustForm = allCustForm;

        home.getBtnPlaceOrder().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                addCustomer.setVisible(true);
                home.dispose();
            }
        });

        home.getBtnSearch().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                
                String [] opt = {"searchCustomer", "searchOrder", "cancel"};

                int option = JOptionPane.showOptionDialog(null, "Please select the option", "Search Options", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);

                switch (option) {
                    case 0:
                        JOptionPane.getRootFrame().dispose();
                        home.dispose();
                        searchCustomer.setVisible(true);
                        break;
                    case 1:
                        JOptionPane.getRootFrame().dispose();
                        home.dispose();
                        searchOrder.setVisible(true);
                        break;
                    case 2:
                        JOptionPane.getRootFrame().dispose();
                        break;
                }
            }
        });

        home.getBtnStatus().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                changeStatus.setVisible(true);
                home.dispose();
            }
        });

        home.getBtnReports().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                form.setVisible(true);
                home.dispose();
            }
        });

        home.getBtnDelete().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                deleteForm.setVisible(true);
                home.dispose();
            }
        });

       

    }

    

}
