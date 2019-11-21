class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {  
        super(brand, kilometers);  
    }

    @Override
    public String doStuff() {
        return "I am " + getbrand() + " and I go glug glug!";
    }
}