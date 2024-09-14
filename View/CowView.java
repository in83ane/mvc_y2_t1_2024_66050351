package View;
import Model.Cow;

public class CowView {
    public void displayCowInfo(Cow cow) {
        if (cow != null) {
            System.out.println("Cow ID: " + cow.getId());
            System.out.println("Color: " + cow.getColor());
            System.out.println("Age: " + cow.getAgeYears() + " years " + cow.getAgeMonths() + " months");
            System.out.println("Milk Production: " + cow.calculateMilkProduction() + " liters");
        } else {
            System.out.println("No cow found with the given ID.");
        }
    }
}
