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
public class HomeTest {
    public static void main(String[] args) {
        System.out.println("test");
        FirstRoom firstRoom = new FirstRoom(24.5, 10, 1);
        SecondRoom secondRoom = new SecondRoom(27, 10, 2);
        double finalTemperature = 24;

        System.out.println(firstRoom.toString());
        System.out.println(secondRoom.toString());
        conditionBACworking(firstRoom, finalTemperature);
        conditionPACworking(secondRoom, finalTemperature);


    }

    private static void conditionBACworking(FirstRoom firstRoom, double finalTemperature) {
        for (; ; ) {
            if (firstRoom.temperature > finalTemperature) {
                firstRoom.basicAirConditioner(firstRoom);
                System.out.println(firstRoom.toString());
            } else {
                System.out.println("temperatura w 1 pokoju została osiągnięta, klima nie dziala.");
                break;
            }
        }
    }

    private static void conditionPACworking(SecondRoom secondRoom, double finalTemperature) {
        for (; ; ) {
            if (secondRoom.temperature > finalTemperature) {
                secondRoom.proAirConditioner(secondRoom);
                System.out.println(secondRoom.toString());
            } else {
                System.out.println("temperatura w 2 pokoju została osiągnięta, klima nie dziala.");
                break;
            }
        }
    }


}
