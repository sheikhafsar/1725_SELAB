public class SecurityCodeCheck {
    private int securityCode=1234;

    public int getSecurityCode(){
        return  securityCode;
    }

    public boolean isCorrectCode(int secCodeTocheck){
        if (secCodeTocheck == getSecurityCode()){
            return true;
        }
        else{
            return false;
        }
    }
}
