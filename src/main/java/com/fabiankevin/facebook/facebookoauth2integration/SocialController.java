package com.fabiankevin.facebook.facebookoauth2integration;

import com.fabiankevin.facebook.facebookoauth2integration.model.Feed;
import com.fabiankevin.facebook.facebookoauth2integration.model.Post;
import com.fabiankevin.facebook.facebookoauth2integration.model.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class SocialController {

    private final Facebook facebook;

    @GetMapping("/greetings")
    public String greet(){
        return "Hello";
    }
    @GetMapping
    public Profile getUser() {
        return facebook.getProfile();
    }

    @GetMapping("/post")
    List<Post> getFeeds(Principal principal){
        System.out.println("principal " +principal);
        return facebook.getFeed();
    }
}
