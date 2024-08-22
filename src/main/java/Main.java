public class Main {
    public static void main(String[] args) {
        // FizzBuzzCoucouTick
        System.out.println(Calculator.Calculer("15:00"));
        System.out.println(Calculator.Calculer("5:15"));
        System.out.println(Calculator.Calculer("10:00"));
        System.out.println(Calculator.Calculer("5:07"));
        System.out.println(Calculator.Calculer("12:30"));
        System.out.println(Calculator.Calculer("16:09"));


        System.out.println();

        // Formes
        Rectangle rect = new Rectangle(4, 10);
        System.out.println("Air: " + rect.getAir() + " Périmètre: " + rect.getPeri());

        Cercle cercle = new Cercle(6);
        System.out.println("Air: " + cercle.getAir() + " Périmètre: " + cercle.getPeri());
    }
}