package bean.injection.cars;

public class Car {
    public String brand;//定义车的品牌
    public String type;//定义车的型号

    public Car(String brand, String type){
        this.type = type;
        this.brand = brand;
    }

    public Car(){}

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "品牌为:"+this.brand+" 类型为:"+this.type;
    }
}
