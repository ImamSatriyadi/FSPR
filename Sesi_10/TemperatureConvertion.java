package Sesi_10;

final class Temperature {
    public double t = 25;

    public double getCelsius() {
        return t;
    }

    public double getFarenheit() {
        return t * 9 / 5 + 32;
    }
}

public class TemperatureConvertion {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println(temp.getCelsius());
        System.out.println(temp.getFarenheit());
    }
}
