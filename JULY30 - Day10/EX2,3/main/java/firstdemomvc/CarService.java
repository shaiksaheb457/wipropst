package firstdemomvc;

public class CarService {
    private CarRepository carRepo;

    public CarService() {
        carRepo = new CarRepository(); // normally use @Autowired but keeping simple
    }

    public java.util.List<String> getAllCars() {
        return carRepo.getCarNames();
    }
}
