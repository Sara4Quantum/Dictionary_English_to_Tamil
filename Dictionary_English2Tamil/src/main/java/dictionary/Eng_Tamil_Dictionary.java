package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component // Spring component annotation to indicate that this class is a Spring-managed component
public class Eng_Tamil_Dictionary {

    // Method to find meanings of English words in a Tamil dictionary
    public ModelAndView tamil_dictionary(Input_collect userInput) throws IOException {
        ModelAndView mav = new ModelAndView();

        // Message to display when the word is not found in the dictionary
        String notfound = ">> மன்னிக்கவும், உங்கள் தேடலுக்கு பொருந்தக்கூடிய  உள்ளடக்கம் எதுவும் கிடைக்கவில்லை. << ";

        // File object for the Tamil dictionary file
        File input = new File("src/main/webapp/Tamil_Dictionary.txt");

        String result = "";

        // Extracting the English word from the user input
        String word = userInput.getEngWord().toLowerCase();

        // Regular expression pattern to match Tamil words
        String regex = "(?i)\\b" + "\\p{IsTamil}+" + "\\b.*";

        // Compile the regular expression pattern
        Pattern patternobj = Pattern.compile(regex);

        // FileReader and BufferedReader for reading the dictionary file
        FileReader frea = new FileReader(input);
       
        BufferedReader br = new BufferedReader(frea);

        // Read each line from the dictionary file
        String line = br.readLine();

        // Iterate through each line of the dictionary
        while (line != null) {

            // Create a Matcher object to match the pattern in the line
            Matcher matcherobj = patternobj.matcher(line);

            // If the pattern is found in the line
            if (matcherobj.find()) {

                // Convert line and word to char arrays
                char LineArray[] = line.toCharArray();
                char Words_Array[] = word.toCharArray();

                // Check if the first characters match
                if (LineArray[0] == Words_Array[0]) {

                    // Iterate through each character of the word
                    for (int i = 0; i < word.length() + 1; i++) {

                        // If the word is found in the line and followed by a tab character
                        if ((line.contains(word)) && (LineArray[i] == '\t')) {

                            // Append the matching line to the result
                            result = result + " " + matcherobj.group();
                        }
                    }
                }
            }
            // Read the next line from the dictionary file
            line = br.readLine();
        }

        // Close the BufferedReader
        br.close();

        // If a matching result is found
        if (!result.isEmpty()) {
            
        	// Add the result and user input to the ModelAndView object
            mav.addObject("foundmeans", result);
            mav.addObject("userEnterWord", userInput.getEngWord());
            
            // Set the view name to display the found result
            mav.setViewName("found.jsp");
            return mav;
        }
       
        // If no meaning is found, add the appropriate message and user input to the ModelAndView object
        mav.addObject("noMeaning", notfound);
        mav.addObject("userEnterWord", userInput.getEngWord());
        // Set the view name to display the not found message
        mav.setViewName("notFound.jsp");
        
        return mav;
    }
}
