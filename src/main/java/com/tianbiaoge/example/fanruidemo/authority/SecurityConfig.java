package com.tianbiaoge.example.fanruidemo.authority;

import com.tianbiaoge.example.fanruidemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .formLogin()
                    .permitAll()
//                    .loginPage("/login")
                .and()

                    .authorizeRequests()
                    .anyRequest()
                    .authenticated()
                .and()
                    .rememberMe()//登录后记住用户，下次自动登录,数据库中必须存在名为persistent_logins的表
                    .tokenValiditySeconds(1209600)
                    .and().csrf().disable();//跨站防护关闭;
//                    .antMatchers("/").access("hasRole('USER')")
//                    .antMatchers("/**").permitAll()
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .userDetailsService(new UserDetailsService() {
                    @Override
                    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                        Integer id = userRepository.findByUserName(username).getId();
                        return userRepository.findOne(id);
                    }
                });
    }
}
