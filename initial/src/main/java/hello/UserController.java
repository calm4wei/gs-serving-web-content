package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */
@Controller
public class UserController {

    @RequestMapping("/user/list")
    public String listUsers(Model model){
        model.addAttribute("users","QQww");
        return "user/listusers";
    }

}
