package devices;

public class Car {
    public String model;
    public String producer;
    public Integer year;
    public Double value;

    public Car(String model, String producer, Integer rokprodukcji, Integer cena) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
        }
    public String toString() {
        return "Car:" +
                "\n\tmodel=" + model +
                "\n\tproducer=" + producer +
                "\n\tyear" + year +
                "\n\tvalue" + value;
    }
        }


