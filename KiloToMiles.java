package sidjava;
	interface Measure {
	    double convert(double measure);
	}

	public class KiloToMiles {

	    public static void main(String[] args) {
	        Measure k1 = (double kilo) -> {
	            return (kilo * 0.62);
	        };
	        System.out.println("Kilometers to Miles: " + k1.convert(256));
	    }
	}

