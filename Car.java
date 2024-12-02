import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String category;
    private Boolean available;
    private Boolean requiresService;

    // Constructors, getters, setters

    public void assignDriver(Driver driver) {
        if (this.available && !this.requiresService && driver.isAvailable() && this.category.equals(driver.getCategory())) {
            this.available = false;
            driver.setAvailable(false);
        }
    }

    public void service() {
        this.requiresService = false;
        this.available = true;
    }
}
