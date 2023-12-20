package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import pojobeans.AccountService;

public class AutoWired {
    private AccountService accountService;
    @Autowired
    public AutoWired(AccountService accountService){
        this.accountService = accountService;
    }
}
