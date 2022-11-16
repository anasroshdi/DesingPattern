package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements Account{
    private float totalBalance;
    private List<Account> accountList = new ArrayList<>();

    @Override
    public float getBalance() {
        totalBalance = 0;
        for(Account account: accountList){
            totalBalance = totalBalance + account.getBalance();
        }
        return  totalBalance;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public void removeAccount(Account account){
        accountList.remove(account);
    }


}
