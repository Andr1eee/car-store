package backend.carstore.models;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mark;

    private Integer price;
    private String modelName;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }



    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    private String engineCapacity;
    private String  horsepower;

    public Car(Long id, String name, String mark, Integer price, String modelName, String engineCapacity, String horsepower, String mileage, Integer year, String imageURL) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
        this.horsepower = horsepower;
        this.mileage = mileage;
        this.year = year;
        this.imageURL = imageURL;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    private String mileage;
    private Integer year;
    @Column(length = 1000)
    private String imageURL;
}
