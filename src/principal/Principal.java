package principal;
import java.util.*;

import clases.ClasesMap;
public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ClasesMap coleccionMap = new ClasesMap();
		
		int op;
		do {
			System.out.println("Menu Colecciones");
			System.out.println("-------------------");
			System.out.println("1) Ingresar notas en una coleccion HashMap");
			System.out.println("2) Ingresar notas en una coleccion TreeMap");
			System.out.println("3) Mostrar claves");
			System.out.println("4) Eliminar una nota en alguna coleccion");
			System.out.println("5) Buscar una nota en alguna coleccion");
			System.out.println("6) Salir");
			System.out.println("Digite la opcion");
			
			op = leer.nextInt();
			leer.nextLine();
			switch(op) {
			case 1:
				coleccionMap.setArregloM();
				System.out.println("-------------------");
				System.out.println(coleccionMap.getArregloM());
				break;
			case 2:
				coleccionMap.setArregloT();
				System.out.println("-------------------");
				System.out.println(coleccionMap.getArregloT());
				break;
			case 3:
				
				System.out.println("Nombres de los alumnos en HashMap:");    
				for (String nombre : coleccionMap.getArregloM().keySet()) {        
					System.out.println(nombre);    
					}
				System.out.println("Nombres de los alumnos en TreeMap:");    
				for (String nombre : coleccionMap.getArregloT().keySet()) {        
					System.out.println(nombre);    
					}
				break;
			case 4:
				System.out.println("En que coleccion quiere eliminar?");
				System.out.println("1) HashMap");
				System.out.println("2) TreeMap");
				
				int seleccion = leer.nextInt();
				leer.nextLine();
				System.out.println("Ingrese el alumno que desea eliminar");
				String nombreAlumno = leer.nextLine();
				switch(seleccion) {
				case 1:
					coleccionMap.removeValoresM(nombreAlumno);
					System.out.println(coleccionMap.getArregloM());
					break;
				case 2:
					coleccionMap.removeValoresT(nombreAlumno);
					System.out.println(coleccionMap.getArregloT());
					break;
				}
				break;
			case 5:
				System.out.println("En que coleccion quiere buscar?");
				System.out.println("1) HashMap");
				System.out.println("2) TreeMap");
			
				int seleccionBuscar = leer.nextInt();
				leer.nextLine();
				System.out.println("Ingrese el Alumno que desea buscar");
				String nombreAlumnoB = leer.nextLine();
				switch(seleccionBuscar) {
				case 1:
					coleccionMap.searchArregloM(nombreAlumnoB);
					break;
				case 2:
					coleccionMap.searchArregloT(nombreAlumnoB);
					break;
				}
				break;
			case 6:
				System.out.println("Saliendo");
				break;
			}
		}while(op < 6);

	}


}
