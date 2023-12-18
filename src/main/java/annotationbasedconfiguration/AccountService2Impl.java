package annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojobeans.Account;
import pojobeans.AccountRepsitory;
import pojobeans.AccountService;

@Service("accountService")
public class AccountService2Impl implements AccountService {
    @Autowired
    private AccountRepsitory accountRepsitory;

    public void setAccountRepsitory(AccountRepsitory accountRepsitory) {
        this.accountRepsitory = accountRepsitory;
    }
    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepsitory.find(fromAccountId);
        Account targetAccount = accountRepsitory.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        accountRepsitory.update(sourceAccount);
        accountRepsitory.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account =accountRepsitory.find(accountId);
        account.setBalance(account.getBalance()+ amount);
        accountRepsitory.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepsitory.find(accountId);
    }
}
