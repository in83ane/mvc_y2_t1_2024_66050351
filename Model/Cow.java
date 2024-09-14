package Model;

public class Cow {
    private String id;
    private String color;
    private int ageYears;
    private int ageMonths;

    public Cow(String id, String color, int ageYears, int ageMonths) {
        this.id = id;
        this.color = color;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public int getTotalAgeInMonths() {
        return ageYears * 12 + ageMonths;
    }

    public double calculateMilkProduction() {
        switch (color.toLowerCase()) {
            case "white":
                return Math.max(0, 120 - getTotalAgeInMonths()); // คำนวณลบอายุตามเดือนจาก 120
            case "brown":
                return Math.max(0, 40 - ageYears); // คำนวณลบอายุปีจาก 40
            case "pink":
                return Math.max(0, 30 - ageMonths); // คำนวณลบอายุเดือนจาก 30
            default:
                return 0;
        }
    }
    
}
