public class Vehicle {
    private int fuel;  // шатахууны хэмжээ хувьд

    public Vehicle() {
        this.fuel = 0;  // эхлээд шатахуун 0 гэж авлаа
    }

    // Шатахуун нэмэх функц
    public void refuel(int amount) {
        if (amount > 0) {
            this.fuel += amount;
            System.out.println("Refueled " + amount + " units. Total fuel: " + this.fuel);
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    // Шатахуун хомс эсэх шалгах функц
    public boolean hasFuel() {
        return this.fuel > 0;
    }

    public void startEngine() {
        if (hasFuel()) {
            System.out.println("Vehicle: Starting the engine...");
            this.fuel--;  // engine start хийхэд шатахуун зарцуулах жишээ
        } else {
            System.out.println("Vehicle: Cannot start engine, no fuel.");
        }
    }

    public void stopEngine() {
        System.out.println("Vehicle: Stopping the engine...");
    }
}
