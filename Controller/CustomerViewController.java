package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

import View.CustomerViewForm;
import View.ViewForm;

public class CustomerViewController extends JFrame{
    
    private ViewForm form;
    private CustomerViewForm custForm;

    public CustomerViewController(ViewForm form, CustomerViewForm custForm){

        this.form = form;
        this.custForm = custForm;

        custForm.getBtnBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                form.setVisible(true);
                custForm.dispose();
            }
        });

    }
}
