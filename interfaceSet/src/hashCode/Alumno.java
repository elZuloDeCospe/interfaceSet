package hashCode;

import java.util.Objects;

public class Alumno 
{
	private String numMatricula;
	private String nombre;
	
	public Alumno()
	{
		
	}
	
	public Alumno(String numMatricula, String nombre)
	{
		this.numMatricula = numMatricula;
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getNumMatricula() 
	{
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) 
	{
		this.numMatricula = numMatricula;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(numMatricula);
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
		Alumno other = (Alumno) obj;
		return Objects.equals(numMatricula, other.numMatricula);
	}
	
	
	
}
