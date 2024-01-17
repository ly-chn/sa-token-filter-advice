package kim.nzxy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ly-chn
 * @since 2024/1/17 9:51
 */
@RestController
@RequestMapping
public class DemoController {
    @GetMapping("hi")
    public String sayHi() {
        return "hi";
    }
}
