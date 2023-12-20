package javabaseconfigruration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobeans.AccountRepsitory;
import pojobeans.AccountRepsitoryImpl;
import pojobeans.AccountService;
import pojobeans.AccountServiceImpl;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceImpl b = new AccountServiceImpl();
        b.setAccountRepsitory(accountDao());
        return b;
    }
    @Bean
    public AccountRepsitory accountDao (){
        AccountRepsitoryImpl b = new AccountRepsitoryImpl();
        return b;
    }
}