package Composite;

public class DespositeAccount implements Account {
    private String accountNo;
    private float accountBalance;

    public DespositeAccount(String accountNo, float accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
}
