public class Main {
    public static void main(String[] args) {

        int ticketPrice = 18905; // стоимость билета
        int mileCost = 20; // стоимость одной мили
        
        int bonusMile = ticketPrice / mileCost;

        System.out.println("Количество бонусных миль: " + bonusMile);
    }
}
