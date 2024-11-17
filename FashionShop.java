import Controller.AddCustomerController;
import Controller.AllCustomerViewController;
import Controller.BestInCustomerController;
import Controller.ChangeOrderStatusController;
import Controller.CustomerViewController;
import Controller.DeleteOrderController;
import Controller.HomePageController;
import Controller.ItemByQtyController;
import Controller.SearchCustomerController;
import Controller.SearchOrderController;
import Controller.ViewFormController;
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
        SearchCustomerForm searchCustomer = new SearchCustomerForm();
        SearchOrderForm searchOrder = new SearchOrderForm();
        ChangeOrderStatusViewForm changeStatus = new ChangeOrderStatusViewForm();
        ViewForm form = new ViewForm();
        DeleteOrderViewForm deleteForm = new DeleteOrderViewForm();
        CustomerViewForm custForm = new CustomerViewForm();
        BestInCustomerViewForm bestInCustomer = new BestInCustomerViewForm();
        AllCustomerViewForm allCustomer = new AllCustomerViewForm();
        ItemQtyViewReport itemByQty = new ItemQtyViewReport();

        HomePageController homeController = new HomePageController(home,Addcustomer,searchCustomer,searchOrder, changeStatus, form, deleteForm);
        AddCustomerController addCustomerController = new AddCustomerController(customer,array,home,Addcustomer,validate);
        SearchCustomerController searchCustomerController = new SearchCustomerController(searchCustomer, home);
        SearchOrderController searchOrderController = new SearchOrderController(searchOrder, home);
        ChangeOrderStatusController changeOrderStatusController = new ChangeOrderStatusController(home, changeStatus);
        ViewFormController viewFormController = new ViewFormController(home, form, custForm, bestInCustomer, allCustomer, itemByQty);
        DeleteOrderController deleteOrderController = new DeleteOrderController(deleteForm, home);
        CustomerViewController customerViewController = new CustomerViewController(form, custForm);
        BestInCustomerController bestInCustomerController = new BestInCustomerController(form, bestInCustomer);
        AllCustomerViewController allCustomerViewController = new AllCustomerViewController(form, allCustomer);
        ItemByQtyController itemByQtyController = new ItemByQtyController(form, itemByQty);

        home.setVisible(true);

        //new SearchCustomerForm().setVisible(true);

        //new SearchOrderForm().setVisible(true);

          //new ViewForm().setVisible(true);

          //new BestInCustomerViewForm().setVisible(true);
          //new CustomerViewForm().setVisible(true);
         // new AllCustomerViewForm().setVisible(true);
          //new ItemQtyViewReport().setVisible(true);
          //new ItemAmountViewReport().setVisible(true);
         // new AllOrderViewForm().setVisible(true);
          //new OrderAmountViewReport().setVisible(true);

          //new ChangeOrderStatusViewForm().setVisible(true);

          //new DeleteOrderViewForm().setVisible(true);
        
    }
}
