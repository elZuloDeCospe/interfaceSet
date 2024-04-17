package hashCode;

import java.util.LinkedHashSet;

import javax.swing.JOptionPane;

public class Main 
{
	static String[] opciones = {"","Alta alumno", "Mostrar alumnos", "Salir"};
	static LinkedHashSet<Alumno> listaAlumnos = new LinkedHashSet<>();
	static String eleccion = "";
	public static void main(String[] args) 
	{
		do
		{
			eleccion = (String) JOptionPane.showInputDialog(null, "Elige una opción", "MENU", 3, null, opciones, opciones[0]);
			
			switch(eleccion)
			{
			case "Alta alumno":
				altaAlumnos();
				break;
				
			case "Mostrar alumnos":
				mostrarAlumnos();
				break;
				
			case "Salir":
				salir();
				break;
			}
		}while(!eleccion.equals("Salir"));	
	}
	
	public static void altaAlumnos()
	{
		String matricula = (String) JOptionPane.showInputDialog("Introduce la matricula del alumno");
		String nombre = (String) JOptionPane.showInputDialog("Introduce el nombre del alumno");
		Alumno alTemp = new Alumno(matricula, nombre);
		listaAlumnos.add(alTemp);
	}
	
	public static void mostrarAlumnos()
	{
		String lista = "Alumnos: \n" ;
		for (Alumno alumno : listaAlumnos) 
		{
			lista += "\n";
			lista += "HashCode del objeto: " + alumno.hashCode() + "\n";
			lista += "Numero de matricula: " + alumno.getNumMatricula() + "\n";
			lista += "Nombre del alumno: " + alumno.getNombre() + "\n";
			
		}
		JOptionPane.showMessageDialog(null, lista);
	}
	
	public static void salir()
	{
		JOptionPane.showMessageDialog(null, "Saliendo");
	}
}
