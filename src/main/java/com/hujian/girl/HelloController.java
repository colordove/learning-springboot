package com.hujian.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "demo")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = { "/hello", "hi" }, method = RequestMethod.GET
    @GetMapping("/hello")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id:" + myId;
//        return "hello";
    }
}
