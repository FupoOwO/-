import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Report {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Trip> generateUsageReport() {
        return entityManager.createQuery("SELECT t FROM Trip t", Trip.class).getResultList();
    }

    public List<Driver> generateDriverWorkReport() {
        return entityManager.createQuery("SELECT d FROM Driver d WHERE d.available = false", Driver.class).getResultList();
    }
}
