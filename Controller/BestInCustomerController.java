package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import View.BestInCustomerViewForm;
import View.ViewForm;

public class BestInCustomerController extends JFrame{

    private ViewForm form;
    private BestInCustomerViewForm bestInCust;

    public BestInCustomerController(ViewForm form, BestInCustomerViewForm bestInCust){

        this.form = form;
        this.bestInCust = bestInCust;

        bestInCust.getBtnBack().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                form.setVisible(true);
                bestInCust.dispose();
            }
        });

    }
    
}
