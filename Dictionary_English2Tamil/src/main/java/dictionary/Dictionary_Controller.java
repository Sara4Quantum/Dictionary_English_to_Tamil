package dictionary;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Dictionary_Controller {
	
	@Autowired
	Eng_Tamil_Dictionary Etd; // Autowired instance of Eng_Tamil_Dictionary
	
	@Autowired
	UserInput usi; // Autowired instance of UserInput for data persistence
	

	@GetMapping("tamildictionary")// Mapping for the homepage of the dictionary
	public String dictionary_Homepage() {
		
		return "dictionaryHome.html"; // Return the name of the HTML template for the dictionary homepage
	}
	
	
	@GetMapping("FindMeaning")// Mapping for finding meanings of input words
	public ModelAndView Meanings(Input_collect results) throws IOException {
		
		// Call the method to find meanings in Eng_Tamil_Dictionary and return a ModelAndView object
		ModelAndView mav = Etd.tamil_dictionary(results);
		
		// Save the input data for further analysis or reference
		usi.save(results);
		
		return mav; // Return the ModelAndView object containing the result
	}
}
