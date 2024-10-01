package clases;
import java.util.*;

public class ClasesMap {
	
	private Scanner leer;	
	private Map <String, List<Double>> arregloM;
	private Map <String, List<Double>> arregloT;
	
	public ClasesMap() {
		leer = new Scanner(System.in);
		arregloM = new HashMap<String, List<Double>>();
		arregloT = new TreeMap<String, List<Double>>();
	}

	public Map<String, List<Double>> getArregloM() {
		return arregloM;
	}

	public void setArregloM() {
		System.out.println("Ingrese 5 notas para 3 alumnos");
		for(int c = 0; c < 5; c++) {
			System.out.println("Ingrese las notas para el alumno" + (c+1) + ":");
			String nombreAlumno = "alumno "+ (c+1) + " .";
			ArrayList<Double> notas = new ArrayList<Double>();
			for(int i = 1; i < 4; i++){
				System.out.println("Ingrese la nota " + i + ":");
				notas.add(leer.nextDouble());
				
			}
			arregloM.put(nombreAlumno, notas  );
		}
	}

	public Map<String, List<Double>> getArregloT() {
		return arregloT;
	}

	public void setArregloT() {
		System.out.println("Ingrese 5 notas para 3 alumnos");
		for(int c = 0; c < 5; c++) {
			String nombreAlumno = "alumno"+ (c+1);
			ArrayList<Double> notas = new ArrayList<Double>();
			for(int i = 1; i < 4; i++){
				System.out.println("Ingrese la nota " + i + ":");
				notas.add(leer.nextDouble());
				
			}
			arregloT.put(nombreAlumno, notas  );
		}
	}
	
	public void removeValoresM(String clave) {
		arregloM.remove(clave);
		System.out.println("Alumno eliminado exitosamente");
	}
	public void removeValoresT(String clave) {
		arregloT.remove(clave);
		System.out.println("Alumno eliminado exitosamente");
	}
	
	public Boolean searchArregloM(String clave) {
		Boolean existe = false;
		if(arregloM.containsKey(clave)) {
			System.out.println(arregloM.get(clave));
			existe = true;
		}else {
			System.out.println("Alumno no existe en la coleccion");
		}
		
		return existe;
	}
	public Boolean searchArregloT(String clave) {
		Boolean existe = false;
		if(arregloT.containsKey(clave)) {
			System.out.println(arregloT.get(clave));
			existe = true;
		}else {
			System.out.println("Alumno no existe en la coleccion");
		}
		return existe;
	}
	
}
