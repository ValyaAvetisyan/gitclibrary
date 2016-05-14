package am.gitc.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {


    @GET
    @Produces("application/json")
    @RequestMapping("/get")
    public Map<String, String> checkUser() {

        Map<String, String> map = new HashMap<>();
//        if (isEmpty(username) && isEmpty(password)) {
//        map.put(ResponseStatus.BAD_REQUEST.getStatus(), ResponseStatus.BAD_REQUEST.getCode().toString());
        return map;
//        }
    }

    @POST
    @Produces("application/json")
    @RequestMapping("/post")
    public Map<String, String> test(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password
    ) {

        Map<String, String> map = new HashMap<>();
//        map.put(ResponseStatus.SUSSES.getStatus(), ResponseStatus.SUSSES.getCode().toString());

        map.put("user", "user data");
        return map;
    }


}
