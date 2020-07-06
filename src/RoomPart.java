////Napisz program, który będzie symulował regulację temperatury w pomieszczeniach pewnego budynku.
////
////Każde pomieszczenie może posiadać niezależny klimatyzator jednego z dwóch typów:
////
////BasicAirConditioner - obniża temperaturę pomieszczenia o 1 stopień na metr sześcienny. Przykładowo jeśli pomieszczenie ma
//// 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,1 stopnia przy każdym wywołaniu metody odpowiedzialnej
//// za schładzanie.
////ProAirConditioner - obniża temperaturę pomieszczenia o 2 stopnie na metr sześcienny. Przykładowo jeśli pomieszczenie ma
//// 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,2 stopnia przy każdym wywołaniu metody odpowiedzialnej
//// za schładzanie.
////W każdym pomieszczeniu zapisana jest aktualna temperatura i numer pomieszczenia. Klimatyzator powinien mieć ustawioną
//// temperaturę docelową po osiągnięciu której nie będzie się włączał.
////
////Po każdorazowym uruchomieniu klimatyzatora (wywołaniu odpowiedniej metody) temperatura w danym pomieszczeniu powinna
//// zostać obniżona (chyba, że osiągnięto temperaturę docelową).
////
////W osobnej klasie utwórz obiekty reprezentujące dwa różne pomieszczenia, w których będą dwa różne klimatyzatory.
//// Przetestuj działanie programu wywołując kilkukrotnie metodę odpowiedzialną za uruchomienie klimatyzatora i wyświetlając
//// aktualną temperaturę danego pomieszczenia
public class RoomPart {
    double temperature;
    double roomCapacity;
    int roomNumber;

    public RoomPart(double temperature, double roomCapacity, int roomNumber) {
        this.temperature = temperature;
        this.roomCapacity = roomCapacity;
        this.roomNumber = roomNumber;
    }
    public double basicAirConditioner(FirstRoom firstRoom) {
        double temperatureReductionBasicAirConditioner = 1/firstRoom.roomCapacity;
        firstRoom.temperature = firstRoom.temperature-temperatureReductionBasicAirConditioner;
        return firstRoom.temperature;
    }
    public double proAirConditioner(SecondRoom secondRoom) {
        double temperatureReductionProAirConditioner = 2/secondRoom.roomCapacity;
        secondRoom.temperature = secondRoom.temperature-temperatureReductionProAirConditioner;
        return secondRoom.temperature;
    }
}
