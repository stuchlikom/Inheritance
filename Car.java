class Car extends Vehicle {
    public Car(String brand, int kilometers) {  
        super(brand, kilometers);  
    }

    @Override
    public String doStuff() {
        return "I am " + getbrand() + " and I go zoom zoom zoom!";
    }
}