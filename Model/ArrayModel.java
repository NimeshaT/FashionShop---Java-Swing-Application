package Model;

public class ArrayModel {

    private CustomerModel [] customerArray;

    public ArrayModel(){
        customerArray = new CustomerModel[0];
    }

    // -----------------------extend Array method-----------------------------
    private void extendArray(){
        
        CustomerModel [] tempCustomerArray = new CustomerModel[customerArray.length+1];

        for(int i = 0; i < customerArray.length; i++){
            tempCustomerArray[i] = customerArray[i];
        }

        customerArray = tempCustomerArray;
    }



    // -----------------------add customer--------------------------------
    public void addCustomer(CustomerModel customer){
        extendArray();
        customerArray[customerArray.length-1]=customer;
    }


    // ------------------------Generate order ID-------------------------
    public String generateOrderId(){
        if (lastObject() == null) {
            return "ODR#000001";
        }
        int lastNumber = Integer.parseInt(lastObject().getOrderId().substring(4));

        return String.format("ODR#%06d",lastNumber + 1);

    }

    public CustomerModel lastObject(){
        if (customerArray.length <= 0) {
            return null;
        }
        return customerArray[customerArray.length-1];
    }


    // --------------------------print Array size-------------------------------------
    public int printArraySize(){
        if (customerArray.length == 0) {
            return -1;
        }
        return customerArray.length;
    }


    // ------------------------------print customer array-----------------------------------

    public void printCustomerArray(){

        for(int i = 0; i< customerArray.length; i++ ){
            customerArray[i].printCustomer();
        }
    }
}
