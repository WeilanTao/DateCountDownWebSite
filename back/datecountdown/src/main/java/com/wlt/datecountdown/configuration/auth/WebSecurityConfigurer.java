package com.wlt.datecountdown.configuration.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Autowired
    private  MyOncePerRequestFilter myOncePerRequestFilter;





    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/userauth","/","/signup").permitAll().
                anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/userauth")
//                .loginProcessingUrl("/login")

                .and().cors().
               and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) ;


        http.addFilterBefore(myOncePerRequestFilter, UsernamePasswordAuthenticationFilter.class);

        /**
         * To check username and password.
         */
//        http.addFilterBefore(myUsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);




    }

}
