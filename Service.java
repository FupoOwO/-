import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime serviceTime;
    
    @ManyToOne
    private Car car;

    // Constructors, getters, setters

    public void performService() {
        if (serviceTime.getHour() >= 8 && serviceTime.getHour() < 17) {
            car.service();
        }
    }
}
