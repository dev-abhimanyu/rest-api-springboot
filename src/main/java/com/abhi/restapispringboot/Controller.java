/**
 * Created by Abhimanyu
 * on 2023-02-26 February 2023
 **/
package com.abhi.restapispringboot;

import com.abhi.restapispringboot.businesslogic.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @RequestMapping("/courses")
    public List<User> getAllUsers(){
        return Arrays.asList(
                new User(1, "Dwight", "Schrute"),
                new User(2, "Jim", "Halpert"),
                new User(3, "Michael", "Scott")
        );
    }

}
