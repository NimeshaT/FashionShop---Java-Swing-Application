package Model;

public class CustomerModel {
    
    private String orderId;
    private String customerId;
    private String size;
    private int qty;
    private double amount;
    private String status;

    public CustomerModel(){}

    public CustomerModel(String orderId, String customerId, String size, int qty, double amount, String status){
        this.orderId=orderId;
        this.customerId=customerId;
        this.size=size;
        this.qty=qty;
        this.amount=amount;
        this.status=status;
    }

    // -------------------------------Setters----------------------------------------------
    public void setOrderId(String orderId){
        this.orderId=orderId;
    }

    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }

    public void setSize(String size){
        this.size=size;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void setStatus(String status){
        this.status=status;
    }

    // --------------------------------------getters-------------------------------------------------
    public String getOrderId(){
        return orderId;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getSize(){
        return size;
    }

    public int getQty(){
        return qty;
    }

    public double getAmount(){
        return amount;
    }

    public String getStatus(){
        return status;
    }

    // --------------------------T-Shirt price calc method------------------------------------
    public double tShirtPriceCalc(int qty, String size){
        double count=0;
        switch (size) {
            case "XS":
                count+=qty*600;
                break;
            case "S":
                count+=qty*800;
                break;
            case "M":
                count+=qty*900;
                break;
            case "L":
                count+=qty*1000;
                break;
            case "XL":
                count+=qty*1100;
                break;
            case "XXL":
                count+=qty*1200;
                break;
        }
        return count;
    }

    // ----------------------------print customer details method---------------------
    public void printCustomer(){
        System.out.println("Order ID : "+orderId);
        System.out.println("Customer ID : "+customerId);
        System.out.println("Size : "+size);
        System.out.println("Qty : "+qty);
        System.out.println("Amount : "+amount);
        System.out.println("Status : "+status);
    }
}
