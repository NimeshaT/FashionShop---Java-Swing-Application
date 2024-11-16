package Model;

public class ValidationModel {
    
    public Boolean validatePhoneNumber(String PhoneNo){

        if(PhoneNo.charAt(0) == 0 && PhoneNo.length()==10){
            return true;
        }
        return false;
    }

    public Boolean validateQuantity(int qty){

        if(qty <= 0 ){
            return false;
        }
        return true;
    }
}
