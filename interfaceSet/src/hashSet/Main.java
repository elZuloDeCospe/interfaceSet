package hashSet;

import java.time.LocalDate;
import java.util.LinkedHashSet;

import hashCode.Alumno;

public class Main 
{
	static LinkedHashSet<Persona> cantantes = new LinkedHashSet<>();
	static LinkedHashSet<Persona> actores = new LinkedHashSet<>();
	public static void main(String[] args) 
	{
		Persona p1 = new Persona("Juan", "Palomo", LocalDate.of(2000,6,30));
		Persona p2 = new Persona("Pedro", "Rincon", LocalDate.of(1996,9,17));
		Persona p3 = new Persona("Antonio", "Garcia", LocalDate.of(1990,3,19));
		Persona p4 = new Persona("Javier", "De la Cal", LocalDate.of(1993,5,22));
		Persona p5 = new Persona("David", "Ruiz", LocalDate.of(1995,1,14));
		
		actores.add(p1);
		actores.add(p2);
		actores.add(p4);
		actores.add(p5);
		
		cantantes.add(p1);
		cantantes.add(p3);
	}

}
