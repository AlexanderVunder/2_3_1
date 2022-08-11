package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private int horsePower;

    public Car(String model, int series, int horsePower) {
        this.model = model;
        this.series = series;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return  "Модель: " + model + "," + " Серия: " + series + "," + " Мощность: " + horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && horsePower == car.horsePower && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, horsePower);
    }
}
