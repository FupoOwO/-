import javax.persistence.*;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private Boolean available;

    // Constructors, getters, setters

    public void assignCar(Car car) {
        if (this.available && car.isAvailable() && this.category.equals(car.getCategory())) {
            car.setAvailable(false);
            this.available = false;
        }
    }
}
