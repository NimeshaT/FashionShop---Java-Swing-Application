package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.DeleteOrderViewForm;
import View.HomePageView;

import java.awt.event.*;

public class DeleteOrderController extends JFrame{

    private DeleteOrderViewForm deleteForm;
    private HomePageView home;

    public DeleteOrderController(DeleteOrderViewForm deleteForm, HomePageView home){

        this.deleteForm = deleteForm;
        this.home = home;

        deleteForm.getBtnBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                deleteForm.dispose();
            }
        });

    }
    
}
