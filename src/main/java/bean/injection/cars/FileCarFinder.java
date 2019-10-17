package bean.injection.cars;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component("fileCarFinder")
public class FileCarFinder implements CarFinder {
    @Override
    public List<Car> findAll() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("car.txt"));
            return lines.stream().map(line -> {
                String brand = line.split(",")[0];
                String type = line.split(",")[1];
                return new Car(brand, type);
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
