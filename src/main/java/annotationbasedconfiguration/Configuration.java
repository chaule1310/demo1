package annotationbasedconfiguration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public AccountService2Impl myBean(){
        return new AccountService2Impl();
    }
}
