package bean.injection.cars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    public static CarFinder fileCarFinder(){
        return new FileCarFinder();
    }

    @Bean
    public static CarFinder memCarFinder(){
        return new MemCarFinder();
    }

    @Bean
    public static CarListener carListener(CarFinder fileCarFinder){
        return new CarListener(fileCarFinder);
    }
}
