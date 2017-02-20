package principal;

public class Ejemplo {

	public static void main(String[] args) {
		argsVariables( 1, 2, 3);
	}
	
	public static void argsVariables( int... args){
		for(int argumento: args){
			System.out.println(argumento + ",");
		}
	}

}
