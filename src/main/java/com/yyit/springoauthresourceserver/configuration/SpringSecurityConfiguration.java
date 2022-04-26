package com.yyit.springoauthresourceserver.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author yyit
 **/
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.authorizeRequests()
                .antMatchers("/hello").hasAuthority("SCOPE_access-hello")
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer().jwt();
        // @formatter:on
    }

}
