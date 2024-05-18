package dictionary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component // Spring component annotation to indicate that this interface is a Spring-managed component
public interface UserInput extends CrudRepository<Input_collect, String> {
    // This interface extends CrudRepository, which provides basic CRUD operations for the Input_collect entity

    // No additional methods are declared here because CrudRepository already provides all necessary methods for CRUD operations
}
