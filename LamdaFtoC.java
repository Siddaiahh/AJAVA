package sidjava;

interface Temp {
    double convert(double temp);
}

public class LamdaFtoC {

    public static void main(String[] args) {
        Temp t1 = (double a) -> {
            return ((a - 32) * 5 / 9);
        };
        System.out.println("Convert Fahrenheit to Celsius: " + t1.convert(28));
    }
}

