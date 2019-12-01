package hotshots.account.admin.hotshotsaccount;

import hotshots.account.admin.hotshotsaccount.account.Exception.ErrorMessage;
import hotshots.account.admin.hotshotsaccount.account.dto.models.UserDto;
import hotshots.account.admin.hotshotsaccount.account.entity.UserInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class HotshotsAccountApplication {

    public static void main(String[] args) {

        SpringApplication.run(HotshotsAccountApplication.class, args);


    }

//    @Bean
//    public UserSignUpResponse userSignUpResponse(){
//        UserSignUpResponse response = new UserSignUpResponse();
//        response.setResponse("User Created");
//        return response;
//    }

    @Bean
    public UserDto UserDto() {
        return new UserDto();
    }

    @Bean
    public UserInfo UserInfo() {
        return new UserInfo();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
