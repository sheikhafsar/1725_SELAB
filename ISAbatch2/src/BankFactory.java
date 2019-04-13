public class BankFactory extends AbstractFactory {
    @Override
    public Loan getLoan(String loan) {
        return null;
    }
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }

        if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
}
