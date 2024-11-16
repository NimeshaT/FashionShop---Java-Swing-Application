package Controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import Model.ArrayModel;
import Model.CustomerModel;
import Model.ValidationModel;
import View.AddCustomerForm;
import View.HomePageView;

public class AddCustomerController {
    
    private ArrayModel arrayModel;
    private CustomerModel customerModel;
    private HomePageView home;
    private AddCustomerForm addCustomer;
    private ValidationModel validate;

    public AddCustomerController(CustomerModel customerModel, ArrayModel arrayModel, HomePageView home, AddCustomerForm addCustomer, ValidationModel validate){
        this.customerModel = customerModel;
        this.arrayModel = arrayModel;
        this.home = home;
        this.addCustomer = addCustomer;
        this.validate = validate;

        addCustomer.getBtnBack().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                home.setVisible(true);
                addCustomer.dispose();
            }
        });

        addCustomer.getTxtOrderId().setText(arrayModel.generateOrderId());

        addCustomer.getTxtCustId().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String contact = addCustomer.getTxtCustId().getText();

                Boolean isValid = validate.validatePhoneNumber(contact);

                if(!isValid){
                    JOptionPane.showMessageDialog(null, "Invalid phone number");
                    addCustomer.getTxtCustId().setText("");
                }
            }
        });

        addCustomer.getTxtQty().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                double amount = customerModel.tShirtPriceCalc((Integer.parseInt(addCustomer.getTxtQty().getText())), addCustomer.getTxtSize().getText());

                addCustomer.getTxtAmount().setText(""+amount);
            }
        });

        addCustomer.getBtnPlaceOrder().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String orderId = addCustomer.getTxtOrderId().getText();
                String CustId = addCustomer.getTxtCustId().getText();
                String size = addCustomer.getTxtSize().getText().toUpperCase();
                int qty = Integer.parseInt(addCustomer.getTxtQty().getText());
                double amount = Double.parseDouble(addCustomer.getTxtAmount().getText());
                String status = "processing";

                CustomerModel c1 = new CustomerModel(orderId, CustId, size, qty, amount, status);
                arrayModel.addCustomer(c1);

                addCustomer.getTxtOrderId().setText(arrayModel.generateOrderId());
                addCustomer.getTxtCustId().setText("");
                addCustomer.getTxtSize().setText("");
                addCustomer.getTxtQty().setText("");
                addCustomer.getTxtAmount().setText("");
                
            }
        });

    }

    
}
