package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
			List<String> messages = new ArrayList<>();
			messages.add("Hey man!");
			messages.add("I'm a cool Spring MVC application");
			messages.add("It's my verson: 5.2.0 by sep'19. Call me so!");
			model.addAttribute("messages", messages);
			return "index";
	}
	
}