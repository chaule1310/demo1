package dependencyinjection;

import pojobeans.Account;
import pojobeans.AccountRepsitory;
import pojobeans.AccountService;

public class AccountServiceConstructorImpl implements AccountService {
    private AccountRepsitory accountRepsitory;

    public AccountServiceConstructorImpl(AccountRepsitory accountRepsitory) {
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
