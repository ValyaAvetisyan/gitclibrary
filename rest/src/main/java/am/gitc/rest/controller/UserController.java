package am.gitc.rest.controller;

import am.gitc.common.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers() {

        return null;
    }


    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Long addUser(@RequestBody User user) {

//        User existingUser = userService.getUserByUsername(user.getUserName());
//        if (existingUser != null) {
//            return 0L;
//        }
//
        return null;
    }
}
