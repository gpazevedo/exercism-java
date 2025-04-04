import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

    static void race(RemoteControlCar car) {
        car.drive();
    }

    static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        return cars.stream().sorted().collect(Collectors.toList());
    }
}
