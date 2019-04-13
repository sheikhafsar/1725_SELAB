public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNumber=newAcctNum;
        securityCode=newSecCode;

        bankWelcome=new WelcomeToBank();
        acctChecker=new AccountNumberCheck();
        codeChecker=new SecurityCodeCheck();
        fundsChecker=new FundsCheck();
    }

    public  int getAccountNumber(){
        return accountNumber;
    }

    public int getSecurityCode(){
        return securityCode;
    }

    public void withdrawCash(double cashToGet){
        if (acctChecker.accountActive(getAccountNumber())&&
            codeChecker.isCorrectCode(getSecurityCode()) &&
                fundsChecker.haveEnoughMoney(cashToGet)){
            System.out.println("Trasaction Complete\n");
        }else {
            System.out.println("Trasaction Failed\n");
        }
    }

    public void depositCash(double cashTodeposite){
        if (acctChecker.accountActive(getAccountNumber())&&
        codeChecker.isCorrectCode(getSecurityCode())){
            fundsChecker.makeDeposit(cashTodeposite);
            System.out.println("Trasaction Complete\n");
        }else {
            System.out.println("Trasaction Failed\n");
        }
    }
}
