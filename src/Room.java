public class Room {
    private double temperature;
    private double roomCapacity;
    private int roomNumber;
    private AirConditioner airConditioner;

    public Room(double temperature, double roomCapacity, int roomNumber, AirConditioner airConditioner) {
        this.temperature = temperature;
        this.roomCapacity = roomCapacity;
        this.roomNumber = roomNumber;
        this.airConditioner = airConditioner;
    }

    public void runAirConditioner(double finalTemperature) {

        if (temperature > finalTemperature) {

            this.temperature -= airConditioner.getPower() / roomCapacity * 10;
            System.out.println(temperature);
        } else {
            System.out.println("temperatura w pokoju" + roomNumber + " została osiągnięta, klima nie dziala.");
        }
    }
}
