import Controller.CowController;
import Model.CowDatabase;
import View.CowGUI;
import View.CowView;

public class Main {
    public static void main(String[] args) {
        CowDatabase model = new CowDatabase();
        CowView view = new CowView();
        CowGUI gui = new CowGUI(); // สร้าง CowGUI ที่นี่

        new CowController(model, gui); // ส่ง CowGUI ไปยัง Controller

    //Debug
    //Cow testCow = new Cow("12345678", "white", 5, 6);//debug
    //System.out.println("Milk Production for white cow: " + testCow.calculateMilkProduction());

    }
}
