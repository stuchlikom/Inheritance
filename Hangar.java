public class Hangar {

    public static void main(String[] args) {
        Car car1 = new Car("Audi",1234);
        Car car2 = new Car("BMW",2345);
        Boat boat1 = new Boat("Titanic",123);
        Boat boat2 = new Boat("Costa Concordia",234);

        System.out.println(car1.doStuff());
        System.out.println(car2.doStuff());
        System.out.println(boat1.doStuff());
        System.out.println(boat2.doStuff());
    }

}