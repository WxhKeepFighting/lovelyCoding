package bean.injection.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class InjectionMixApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contain = SpringApplication.run(InjectionMixApplication.class, args);
        System.out.println("bean来自于"+contain.getBeanFactory().getBeanDefinition("carListener").getResourceDescription());
        CarListener carListener = contain.getBean(CarListener.class);
        List<Car> cars = carListener.Carinformation("宝马");
        System.out.println(cars);
    }

}
