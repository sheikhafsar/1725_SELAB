public class BankAccount {
    private int accountNumber;
    private int securityCode;

    VerifyAccountNumber verifyAccountNumber;

    public BankAccount(int newAcctNum, int newSecCode){
        accountNumber=newAcctNum;
        securityCode=newSecCode;

        verifyAccountNumber = new VerifyAccountNumber();
    }




}
