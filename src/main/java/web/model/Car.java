package web.model;

public class Car {
    private String model;
    private String series;
    private int years;

    public Car(){}

    public Car(String model, String series, int years) {
        this.model = model;
        this.series = series;
        this.years = years;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", years=" + years +
                '}';
    }
}
