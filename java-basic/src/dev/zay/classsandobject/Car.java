package dev.zay.classsandobject;

public class Car {

    // Access Modifiers
    /*
    The common rule of thumb:
        - Field are private
        - Methods & classed need are public
        - Helper methods are private
        - Use protected only when you are designing a class to be entended.
     */

    public String brand; // anyone can read or change it
    protected int speed; // same package + child classes
    String color; // default: same package only
    private String engineCode; // only code inside Car

    public void showInfo() {
        // anyone can call it
    }

    public void accelerate(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.speed += amount;
    }

    // Helper method
    private void checkEngine(String engineCode) {
        // only Car can call it
        if (engineCode == null || engineCode.isBlank()) {
            throw new IllegalArgumentException("Engine code is required");
        }
    }

    // Getter & Setter
    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        checkEngine(engineCode);
        this.engineCode = "(" + engineCode + ")";
    }
}