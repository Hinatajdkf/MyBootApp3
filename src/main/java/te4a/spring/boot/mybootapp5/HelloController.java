package te4a.spring.boot.mybootapp5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/taro")
    public String index() {
        return "index";
    }
}
