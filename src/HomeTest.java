public class HomeTest {
    public static void main(String[] args) {
        Room firstRoom = new Room(24.5, 10, 1, new BasicAirConditioner());
        Room secondRoom = new Room(27, 10, 2, new ProAirConditioner());
        double finalTemperature = 23;

        firstRoom.runAirConditioner(finalTemperature);
        firstRoom.runAirConditioner(finalTemperature);
        firstRoom.runAirConditioner(finalTemperature);

        secondRoom.runAirConditioner(finalTemperature);
        secondRoom.runAirConditioner(finalTemperature);
        secondRoom.runAirConditioner(finalTemperature);

    }
}
