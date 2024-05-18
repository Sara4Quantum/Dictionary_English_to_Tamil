package dictionary;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity; // Import statement for JPA Entity annotation
import jakarta.persistence.Id; // Import statement for JPA Id annotation

@Entity // Annotation to indicate that this class is an entity mapped to a database table
@Component // Spring component annotation to indicate that this class is a Spring-managed component
public class Input_collect {
    
    @Id // Annotation to specify the primary key of the entity
    private String engWord; // Variable to store the English word input
    
    // Getter method for the engWord field
    public String getEngWord() {
        
    	return engWord;
    }

    // Setter method for the engWord field
    public void setEngWord(String engWord) {
        
    	this.engWord = engWord;
    }
}
