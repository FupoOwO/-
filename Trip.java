import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    
    @ManyToOne
    private Driver driver;
    
    @ManyToOne
    private Car car;

    // Constructors, getters, setters

    public void start() {
        this.startTime = LocalDateTime.now();
    }

    public void end() {
        this.endTime = LocalDateTime.now();
        car.setRequiresService(true);
        driver.setAvailable(true);
        car.setAvailable(false);
    }
}
