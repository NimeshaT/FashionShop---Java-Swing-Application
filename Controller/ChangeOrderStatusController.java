package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.ChangeOrderStatusViewForm;
import View.HomePageView;

import java.awt.event.*;

public class ChangeOrderStatusController extends JFrame{

    private HomePageView home;
    private ChangeOrderStatusViewForm changeStatus;

    public ChangeOrderStatusController(HomePageView home, ChangeOrderStatusViewForm changeStatus){

        this.home = home;
        this.changeStatus = changeStatus;

        changeStatus.getBtnBack().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                changeStatus.dispose();
            }
        });

    }
    
}
