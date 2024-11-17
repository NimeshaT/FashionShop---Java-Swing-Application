import Controller.AddCustomerController;
import Controller.HomePageController;
import Model.ArrayModel;
import Model.CustomerModel;
import Model.ValidationModel;
import View.AddCustomerForm;
import View.AllCustomerViewForm;
import View.AllOrderViewForm;
import View.BestInCustomerViewForm;
import View.ChangeOrderStatusViewForm;
import View.CustomerViewForm;
import View.DeleteOrderViewForm;
import View.HomePageView;
import View.ItemAmountViewReport;
import View.ItemQtyViewReport;
import View.OrderAmountViewReport;
import View.SearchCustomerForm;
import View.SearchOrderForm;
import View.ViewForm;

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

          new ViewForm().setVisible(true);

          //new BestInCustomerViewForm().setVisible(true);
          //new CustomerViewForm().setVisible(true);
         // new AllCustomerViewForm().setVisible(true);
          //new ItemQtyViewReport().setVisible(true);
          //new ItemAmountViewReport().setVisible(true);
         // new AllOrderViewForm().setVisible(true);
          //new OrderAmountViewReport().setVisible(true);

          new ChangeOrderStatusViewForm().setVisible(true);

          new DeleteOrderViewForm().setVisible(true);
        
    }
}
