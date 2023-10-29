public class InitialMortgagePayment {

    public static void main(String[] args) {

        final int apartmentPrice = 8500000;
        System.out.println("apartmentPrice = " + apartmentPrice);

        final double percentOfInitialPayment = 21.5;
        System.out.println("percentOfInitialPayment = " + percentOfInitialPayment);

        final double amountOfInitialPayment = apartmentPrice * percentOfInitialPayment / 100;
        System.out.println("amountOfInitialPayment = " + amountOfInitialPayment);
    }
}
