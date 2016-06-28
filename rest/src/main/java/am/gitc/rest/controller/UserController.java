package am.gitc.rest.controller;

import am.gitc.common.model.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "User accounts management")
@RestController
@RequestMapping("/login")
public class UserController {


    @ApiOperation("Retrieve a list of all users")
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
