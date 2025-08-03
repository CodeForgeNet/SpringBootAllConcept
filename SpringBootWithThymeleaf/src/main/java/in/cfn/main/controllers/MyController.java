// Defines the package for this class
package in.cfn.main.controllers;

import java.util.List;

// Imports the Controller annotation
import org.springframework.stereotype.Controller;
// Imports the Model interface for passing data to the view
import org.springframework.ui.Model;
// Imports the GetMapping annotation
import org.springframework.web.bind.annotation.GetMapping;

// Marks this class as a Spring MVC Controller
@Controller
public class MyController {
	
	// Maps HTTP GET requests for /profile to this method
	@GetMapping("/openProfile")
	// Method to handle the /profile request, receives a Model object
	public String openProfilePage(Model model) {
		
		String name = "Karan";
		
		// Adds the name to the model with key "modelName" for the view
		model.addAttribute("modelName", name);
		
		// Returns the view name "profile" to be rendered
		return "profile";
	}
	
	
	
	@GetMapping("/openConditional")
	public String openConditionalPage(Model model) {
		int no1=10, no2=20;
		model.addAttribute("no1",no1);
		model.addAttribute("no2",no2);
		return "conditional";
	}
	
	
	
	@GetMapping("/openLooping")
	public String openLoopingPage(Model model) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		model.addAttribute("modelNumbers", numbers);
		return "looping";
	}
	
	
	

}