public class AccountNumberCheck {

    private int accountNumber=12345678;

    public int getAccountNumber(){
        return  accountNumber;
    }

    public boolean accountActive(int accNumTocheck){
        if (accNumTocheck == getAccountNumber()){
            return true;
        }
        else{
            return false;
        }
    }
}
