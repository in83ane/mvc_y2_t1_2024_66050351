package Model;

public class MilkProduction {
    public static double calculateMilk(Cow cow) {
        int totalMonths = cow.getAgeYears() * 12 + cow.getAgeMonths();
        double milkProduced = 0;

        switch (cow.getColor().toLowerCase()) {
            case "white":
                milkProduced = 120 - totalMonths;
                break;
            case "brown":
                milkProduced = 40 - cow.getAgeYears();
                break;
            case "pink":
                milkProduced = 30 - cow.getAgeMonths();
                break;
            default:
                System.out.println("Invalid cow color.");
        }

        return milkProduced > 0 ? milkProduced : 0;
    }
}
