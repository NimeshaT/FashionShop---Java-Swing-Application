import Controller.HomePageController;
import Model.ArrayModel;
import Model.CustomerModel;
import View.AddCustomerForm;
import View.HomePageView;
import View.SearchCustomerForm;
import View.SearchOrderForm;

public class FashionShop {

    public static void main(String[] args) {
        

        HomePageView home = new HomePageView();
        AddCustomerForm Addcustomer = new AddCustomerForm();

        HomePageController homeController = new HomePageController(home,Addcustomer);


        home.setVisible(true);

        new SearchCustomerForm().setVisible(true);

        new SearchOrderForm().setVisible(true);
    }
}
