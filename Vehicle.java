abstract class Vehicle {
    //Attributes
    private String brand;
    private int kilometers;

    //Constructor
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // Getters
    String getbrand() {
        return this.brand;
    }
    int getkilometers() {
        return this.kilometers;
    }

    // Setters
    void setbrand(String brand) {
        this.brand = brand;
    }
    void setkilometers(int present) {
        this.kilometers = kilometers;
    }

	public abstract String doStuff();

}