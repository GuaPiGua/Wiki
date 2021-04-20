package com.hj.wiki.controller.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("wdnmd")
    public String test(){
        return "sdfsdfadasfdasretwterwtwertwertwertwertwertwertert";
    }
}
