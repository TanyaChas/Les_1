package p2;

public class Car {
    String engineModel;   // модкль

    float weight;      // вага

    void showWeightAndEngineModel() {
        System.out.println("a car has the nest traits" + weight + " " + engineModel);
    }

    public static void main (String[] args) {        // описання конкретного авто
        Car c1 = new Car();
        c1.engineModel = "v8";
        c1.weight = 1300;

        c1.showWeightAndEngineModel();
    }

}
