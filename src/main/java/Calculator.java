import java.util.Objects;

public class Calculator {
    public static String Heure (String temps) {
        String[] heure = temps.split(":");
        if (Objects.equals(heure[1], "30")) { return "Coucou";}
        return "Coucou".repeat(Math.max(0, Integer.parseInt(heure[0])));
    }

    public static String Minutes (String temps) {
        int heure = Integer.parseInt(temps.split(":")[1]);
        String minutes = "";
        if (heure % 3 == 0) { minutes += "Fizz"; }
        if (heure % 5 == 0) { minutes += "Buzz"; }
        if (minutes.isEmpty() || heure == 0) { return "Tick"; }
        if (heure == 30) { return ""; }
        return minutes;
    }

    public static String Calculer (String temps) {
        return Heure(temps) + Minutes(temps);
    }
}
