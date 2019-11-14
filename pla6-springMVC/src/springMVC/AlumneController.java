package springMVC;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springMVC.Alumne;

@Controller
@RequestMapping("/alumne")
public class AlumneController {
	

	@RequestMapping("/form")
	public String veureForm(Model model) {
		Alumne alumne = new Alumne();
		
		model.addAttribute("alumne", alumne);
		return "form-alumne";
	}

	@RequestMapping("/processar")
	public String processarForm(@Valid @ModelAttribute("alumne") Alumne alumne, 
			BindingResult bindingResult) {
	
		if (bindingResult.hasErrors()) {
			return "form-alumne";
		} else {
			return "veure-alumne";
		}
	}
	
}
