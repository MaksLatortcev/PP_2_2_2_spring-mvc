package web.model;


public class Car {

    private long id;
    private String modelCar;
    private String govNumber;

    public Car() {
    }

    public Car(long id, String name, String govNumber) {
        this.id = id;
        this.modelCar = name;
        this.govNumber = govNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (id != car.id) {
            return false;
        }
        if (!modelCar.equals(car.modelCar)) {
            return false;
        }
        return govNumber.equals(car.govNumber);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + modelCar.hashCode();
        result = 31 * result + govNumber.hashCode();
        return result;
    }
}
