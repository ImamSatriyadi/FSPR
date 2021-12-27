package Sesi_10;

class Computer {
    private double cpuSpeed;

    Computer() {
        cpuSpeed = 0;
    }

    void setCpuSpeed(double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }

    public static void whatIsIt() {
        System.out.println("It is a PC");
    }
}

class Tablet extends Computer {
    private double screenSize;

    void setScreenSize(double _screenSize) {
        screenSize = _screenSize;
    }

    double getScreenSize() {
        return screenSize;
    }

    public static void whatIsIt() {
        System.out.println("It is a Tablet");
    }
}

public class ContohSatu {
    public static void main(String[] args) {
        Computer myTab = new Tablet();
        myTab.setCpuSpeed(2.5);
        // myTab.setScreenSize(10);
        System.out.println(myTab.getCpuSpeed());
        // System.out.println(myTab.getScreenSize());
        Tablet.whatIsIt();
    }
}