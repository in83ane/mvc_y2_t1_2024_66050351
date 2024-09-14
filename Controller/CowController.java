// package Controller;
// import Model.Cow;
// import Model.CowDatabase;
// import View.CowGUI;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.List;

// public class CowController {
//     private CowDatabase model;
//     private CowGUI gui;
//     private List<Cow> cowList;
//     private int currentIndex;

//     public CowController(CowDatabase model, CowGUI gui) {
//         this.model = model;
//         this.gui = gui;
//         this.cowList = new ArrayList<>();
//         this.currentIndex = -1;

//         // ทำlistener ปุ่มsearch
//         this.gui.setSearchButtonListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 handleSearchCow();
//             }
//         });

//         // ทำlistener ปุ่มclear
//         this.gui.setClearButtonListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 handleClear();
//             }
//         });
//     }

//     private void handleSearchCow() {
//         String cowId = gui.getCowIdInput();
//         Cow cow = model.getCowById(cowId);

//         if (cow != null) {
//             cowList.clear();
//             cowList.add(cow);
//             currentIndex = 0;
//             gui.clearDisplay();
//             updateCowDisplay();
//         } else {
//             gui.displayResult("No cow found with ID: " + cowId);
//             gui.displayCurrentCow("");
//         }
//     }

//     private void handleClear() {
//         gui.resetSearch();
//         cowList.clear();
//         currentIndex = -1;
//     }

//     private void updateCowDisplay() {
//         if (currentIndex >= 0 && currentIndex < cowList.size()) {
//             Cow cow = cowList.get(currentIndex);
//             double milkProduction = cow.calculateMilkProduction();
//             gui.displayCurrentCow("Cow ID: " + cow.getId() + ", Color: " + cow.getColor() + ", Age: " + cow.getAgeYears() + " years. got Milk : " + String.format("%.0f", milkProduction) + " liters.");
//         }
//     }
// }
package Controller;

import Model.Cow;
import Model.CowDatabase;
import View.CowGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CowController {
    private CowDatabase model;
    private CowGUI gui;
    private List<Cow> cowList;
    private int currentIndex;

    public CowController(CowDatabase model, CowGUI gui) {
        this.model = model;
        this.gui = gui;
        this.cowList = new ArrayList<>();
        this.currentIndex = -1;

        // Set up the listener for the search button
        this.gui.setSearchButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSearchCow();
            }
        });

        // Set up the listener for the clear button
        this.gui.setClearButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClear();
            }
        });
    }

    private void handleSearchCow() {
        String cowId = gui.getCowIdInput();
        Cow cow = model.getCowById(cowId);

        if (cow != null) {
            cowList.clear();
            cowList.add(cow);
            currentIndex = 0;
            gui.clearDisplay();
            updateCowDisplay();
        } else {
            gui.clearDisplay(); // Clear the display
            gui.displayResult("No cow found with ID: " + cowId); // Show result
            gui.clearInput(); // Clear input
        }
    }

    private void handleClear() {
        gui.resetSearch();
        cowList.clear();
        currentIndex = -1;
    }

    private void updateCowDisplay() {
        if (currentIndex >= 0 && currentIndex < cowList.size()) {
            Cow cow = cowList.get(currentIndex);
            double milkProduction = cow.calculateMilkProduction();
            gui.displayCurrentCow("Cow ID: " + cow.getId() + ", Color: " + cow.getColor() + ", Age: " + cow.getAgeYears() + " years. Milk production: " + String.format("%.2f", milkProduction) + " liters.");
        }
    }
}
