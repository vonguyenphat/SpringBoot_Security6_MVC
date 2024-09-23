package duytan.cdio.da_qlsukien_nhom9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/member")
    public String member() {
        return "member";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }
}
