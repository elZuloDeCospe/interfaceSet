package hashSet;

import java.time.LocalDate;
import java.util.Objects;

public class Persona 
{
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Persona()
	{
		
	}
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(apellido, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
