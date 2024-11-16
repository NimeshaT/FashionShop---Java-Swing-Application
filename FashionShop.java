import Controller.AddCustomerController;
import Controller.HomePageController;
import Model.ArrayModel;
import Model.CustomerModel;
import Model.ValidationModel;
import View.AddCustomerForm;
import View.HomePageView;
import View.SearchCustomerForm;
import View.SearchOrderForm;

public class FashionShop {

    public static void main(String[] args) {
        
        CustomerModel customer = new CustomerModel();
        ArrayModel array = new ArrayModel();
        ValidationModel validate = new ValidationModel();

        HomePageView home = new HomePageView();
        AddCustomerForm Addcustomer = new AddCustomerForm();

        HomePageController homeController = new HomePageController(home,Addcustomer);
        AddCustomerController addCustomerController = new AddCustomerController(customer,array,home,Addcustomer,validate);

        home.setVisible(true);

        //new SearchCustomerForm().setVisible(true);

        //new SearchOrderForm().setVisible(true);
    }
}
