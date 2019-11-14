package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IniciController {

	@RequestMapping("/")
	public String veurePagina() {
		return "inici";
	}
}
