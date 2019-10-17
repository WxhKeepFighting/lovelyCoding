package bean.injection.cars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("memCarFinder")
public class MemCarFinder implements CarFinder {

    @Override
    public List<Car> findAll() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("宝马","X5"));
        list.add(new Car("凯迪拉克", "xts"));
        list.add(new Car("保时捷","卡宴"));
        return list;
    }
}
