public class FundsCheck {
    private double cashInAccount=1000.00;
    public double getCashInAccount(){
        return cashInAccount;
    }

    public  void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -=cashWithdrawn;
    }

    public  void increaseCashInAccount(double cashDeposited){
        cashInAccount +=cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){
        if (cashToWithdrawal>getCashInAccount()){
            System.out.println("Error: You dont have enough money");
            System.out.println("Current Balance:"+getCashInAccount());
            return false;
        }
        else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawl Completed,Current Balance:"+getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Completed,Current Balance:"+getCashInAccount());
    }
}
