package hotshots.account.admin.hotshotsaccount.Configuration;

import hotshots.account.admin.hotshotsaccount.account.Exception.ErrorMessage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public ErrorMessage createErrorMessage(Date dateTime, String message, String detail){
        return new ErrorMessage(dateTime, message, detail);
    }

    @Bean
    public ModelMapper GetModelMapper(){
        return new ModelMapper();
    }
}
