package com.wlt.datecountdown.configuration.components;

import com.wlt.datecountdown.entity.NewDate;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Generate Token, Validate Token, Refresh Token, Get Token
 *
 */
public class JwtTokenUtil {

    private static final String SECRET_KEY="dcd";


    /**
     * Generate Token
     *
     * @param userDetails
     * @return token
     */
    public String  generateToken(UserDetails userDetails){
        Map<String, Object> claims= new HashMap<>(2);
        claims.put(Claims.SUBJECT,userDetails.getUsername());
        claims.put(Claims.ISSUED_AT, new Date());
        Date expir= new Date(System.currentTimeMillis()+3600000L * 48);
        return Jwts.builder().setClaims(claims).setExpiration(expir).signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();
    }

    /**
     * Extract information from a token
     * @param token
     * @param claimsResolver
     * @param <T>
     * @return
     */
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims= Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
        return claimsResolver.apply(claims);
    }

    public String extractUserName(String token){
        return extractClaim(token, Claims::getSubject);
    }

    public Boolean isExpir(String token){
        Date current=new Date();
        return extractClaim(token, Claims::getExpiration).before(current);
    }

}
