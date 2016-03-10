package am.gitc.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/register")
public class RegistrationController {


    @PUT
    @Produces("application/json")
    @RequestMapping(value = "put")
    public Map<String, String> register(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname,
            @RequestParam(value = "login") String login,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "confirmPassword") String confirmPassword) {

        Map<String, String> dataMap = new HashMap<>();


        return dataMap;
    }

}
