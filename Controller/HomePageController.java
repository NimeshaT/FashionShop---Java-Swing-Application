package Controller;

import View.*;
import java.awt.event.*;

public class HomePageController {
    
    private AddCustomerForm addCustomer;
    private HomePageView home;

    public HomePageController(HomePageView home,AddCustomerForm addCustomer){

        this.addCustomer = addCustomer;
        this.home = home;

        home.getBtnPlaceOrder().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                addCustomer.setVisible(true);
                home.dispose();
            }
        });
    }

    

}
