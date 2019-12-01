package hotshots.account.admin.hotshotsaccount.account.security;

import hotshots.account.admin.hotshotsaccount.account.service.UserService;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public WebSecurity(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    // Disables Authentication request for User SignUp
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.POST, "/users")
                .permitAll().anyRequest().authenticated().and().addFilter(new AuthenticationFilter(authenticationManager())).
                addFilter(new AuthorizationFilter(authenticationManager()));
    }

    // This will call the LoadByUSerName in UserService Impl.
    // Which is used by Authentication Filter
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(this.userService).passwordEncoder(this.bCryptPasswordEncoder);
    }
}
