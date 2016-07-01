package am.gitc.rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "User accounts management")
@RestController
@RequestMapping(value = "/register",produces = {MediaType.APPLICATION_JSON_VALUE})
public class RegistrationController {

    @ApiOperation("Add a new user")
    @RequestMapping(value = "put",method = RequestMethod.POST)
    @ResponseBody
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
