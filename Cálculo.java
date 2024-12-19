package TetraPackage;

	public class Cálculo {

	    public static double tetracion(double base, double n) {
	        if (n == 1) {
	        }
	        double r = base;
	        int i;
	        for(i=0; i<n-1; i++) {
	        r = Math.pow(r, base);
	        
	        }
			return r;
	        }
	        
	    public static void main(String[] args) {
	        double base = 3;
	        int n = 6;

	        double r = tetracion(base, n);
	        System.out.println("Tetración "+n +" de "+base+" es: "+r);
	    }
	    
	}
	
	
		
	

	


