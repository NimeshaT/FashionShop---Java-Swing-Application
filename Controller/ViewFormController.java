package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.AllCustomerViewForm;
import View.BestInCustomerViewForm;
import View.CustomerViewForm;
import View.HomePageView;
import View.ItemQtyViewReport;
import View.ViewForm;

import java.awt.event.*;

public class ViewFormController extends JFrame{

    private HomePageView home;
    private ViewForm form;
    private CustomerViewForm custForm;
    private BestInCustomerViewForm bestInCustForm;
    private AllCustomerViewForm allCustForm;
    private ItemQtyViewReport itemByQty;

    public ViewFormController(HomePageView home, ViewForm form, CustomerViewForm custForm, BestInCustomerViewForm bestInCustForm,AllCustomerViewForm allCustForm, ItemQtyViewReport itemByQty){

        this.home = home;
        this.form = form;
        this.custForm = custForm;
        this.bestInCustForm = bestInCustForm;
        this.allCustForm = allCustForm;
        this.itemByQty = itemByQty;

        form.getBtnBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                form.dispose();
            }
        });

        form.getBtnViewCust().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                custForm.setVisible(true);
                form.dispose();
            }
        });

        form.getBtnBestInCust().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                bestInCustForm.setVisible(true);
                form.dispose();
            }
        });

        form.getBtnAllCust().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                allCustForm.setVisible(true);
                form.dispose();
            }
        });

        form.getBtnByQty().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent evt){
                itemByQty.setVisible(true);
                form.dispose();
            }
        });

    }
    
}
