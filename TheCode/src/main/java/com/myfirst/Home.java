package com.myfirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Home {
	@RequestMapping("/")
    public String dashboard1() {
        return "Home.jsp";
	}
	@RequestMapping("/success")
    public String dashboard2() {
        return "Success.jsp";
	}
    @RequestMapping(value="/testcode", method=RequestMethod.POST)
        public String test(@RequestParam(value="password") String password) {
    	if (password.equals("bushido")) {
    		return "redirect:/success";
    	} else {
    		return "redirect:/createError";
    	}
    }
 
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        return "redirect:/";
    }
}

