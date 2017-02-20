package principal;

import java.time.LocalDateTime;
import java.util.Scanner;

import personas.Persona;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p = new Persona("Juan Martínez", "234567890X", LocalDateTime.now());
		asignarNacimiento(p);
		mostrarPersona(p);
		p.setNacimiento(pedirNacimiento());
		mostrarPersona(p);
		//argsVariables( 1, 2, 3);
	}
	
	/**
	 * @param p
	 */
	private static void asignarNacimiento(Persona p) {
		LocalDateTime dt = LocalDateTime.parse("1967-08-19T00:00");
		p.setNacimiento(dt);
		mostrarPersona(p);
		
	}
	
	private static void mostrarPersona(Persona p){
		System.out.println(p);
		//System.out.println("El mes tenía" + p.getNacimiento().lengthOfMonth());
	}

	/**
	 * Función con número de argumentos variables
	 * @param args
	 */
	public static void argsVariables( int... args){
		for(int argumento: args){
			System.out.println(argumento + ",");
		}
	}
	
	public static LocalDateTime pedirNacimiento(){
		Scanner leer = new Scanner(System.in);
		System.out.print("Año:");
		int any = leer.nextInt();
		System.out.print("Mes:");
		int mes = leer.nextInt();
		System.out.print("Día:");
		int dia = leer.nextInt();
		System.out.print("Hora:");
		int hora = leer.nextInt();
		System.out.print("Minutos:");
		int minutos = leer.nextInt();
		
		return LocalDateTime.of(any, mes, dia, hora, minutos);
	}

}
