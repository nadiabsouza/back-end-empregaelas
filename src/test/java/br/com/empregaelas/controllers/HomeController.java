package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Caminho: java/com/web/empregaelas/SpringWeb

@Controller
public class HomeController {

	@GetMapping("/home")  //definindo que é rota principal. Homepage
	
	public ModelAndView getList() {
		ModelAndView mv = new ModelAndView("index");
		return mv;

}
}
