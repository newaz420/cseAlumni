package com.alumni.controller;

import com.alumni.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by newaz on 5/7/17.
 */

@RestController
public class UserController {

    @RequestMapping(value = "/api/registration", method = RequestMethod.GET)
    @ResponseBody
    public HttpStatus what(){
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/api/registration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<User> postForm(@RequestBody User user){
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/getUser/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<User> postForm(@PathVariable Integer id){
        User user = new User(id,"one","two");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}
