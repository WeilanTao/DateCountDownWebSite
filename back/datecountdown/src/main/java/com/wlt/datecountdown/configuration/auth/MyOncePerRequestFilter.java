package com.wlt.datecountdown.configuration.auth;

import com.wlt.datecountdown.configuration.components.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyOncePerRequestFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (authHeader!=null&& authHeader.startsWith("Bearer")) {
            String token = authHeader.replace("Bearer", "").trim();
            boolean isExpire=false;
            try {
                isExpire =this.jwtTokenUtil.isExpir(token);
            }catch (Exception e){
                new Throwable("Token has expired. Please login again"+e.getMessage());
            }

            if (!isExpire){
                String userName= null;
                userName=jwtTokenUtil.extractUserName(token);

                if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null){
                    UserDetails userDetails=userDetailsService.loadUserByUsername(userName);
                    boolean isValid = false;
                    try {
                        isValid=jwtTokenUtil.validateToken(token, userDetails);
                    }catch(Exception e){
                        new Throwable("token is invelidated:"+e.getMessage());
                    }

                    if(isValid){
                        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                                        userDetails, null, userDetails.getAuthorities());
                        usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                    }

                }
            }

        }
        chain.doFilter(request, response);

    }
}
