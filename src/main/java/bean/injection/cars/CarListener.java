package bean.injection.cars;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component("carListener")
public class CarListener {
    private CarFinder carFinder;
    public CarListener(@Qualifier("memCarFinder") CarFinder carFinder){
        this.carFinder = carFinder;
    }
    List<Car> Carinformation(String mybrand){
        return carFinder.findAll().stream()
                .filter(car -> car.brand.equals(mybrand))
                .collect(Collectors.toList());
    }
}
