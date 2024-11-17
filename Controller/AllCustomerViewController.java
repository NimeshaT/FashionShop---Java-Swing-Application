package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.AllCustomerViewForm;
import View.ViewForm;

import java.awt.event.*;

public class AllCustomerViewController extends JFrame{

    private ViewForm form;
    private AllCustomerViewForm allCustForm;

    public AllCustomerViewController(ViewForm form, AllCustomerViewForm allCustForm){

        this.form = form;
        this.allCustForm = allCustForm;

        allCustForm.getBtnBack().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                form.setVisible(true);
                allCustForm.dispose();
            }
        });

    }
    
}
