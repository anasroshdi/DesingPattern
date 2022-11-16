package Composite;

public class SavingAccount implements Account {

    private String accountNo;
    private float accountBalance;

    public SavingAccount(String accountNo, float accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
}
