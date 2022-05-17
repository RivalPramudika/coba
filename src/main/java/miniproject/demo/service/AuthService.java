package miniproject.demo.service;

import miniproject.demo.entity.payload.PhoneResponse;
import miniproject.demo.entity.payload.TokenResponse;
import miniproject.demo.entity.User;
import miniproject.demo.entity.payload.UsernamePassword;

import javax.servlet.http.HttpServletRequest;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
    PhoneResponse generatePhone(HttpServletRequest request) ;
}
