package interfaceSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetNombres 
{
	public static void main(String[] args)
	{
		HashSet<String> lista = new HashSet<>();
		
		lista.add("Rodrigo");
		lista.add("Alvaro");
		lista.add("Marian");
		lista.add("Maria");
		lista.add("Elena");
		
		System.out.println("Los elementos del HashSet son:");
		
		mostrar(lista);
		mostrar2(lista);
		
		if(lista.contains("Rodrigo"))
		{
			System.out.println();
			System.out.println("Existe");
		}
		else
		{
			System.out.println();
			System.out.println("No existe");
		}
		
		
		lista.remove("Elena");
		
		mostrar(lista);
		mostrar2(lista);
	}

	public static void mostrar(HashSet<String> lista) 
	{
		System.out.println();
		for (String elemento : lista) 
		{
			System.out.println(elemento);
		}
		System.out.println("Numero de elementos en la lista: " + lista.size());
	}
	
	public static void mostrar2(HashSet<String> lista)
	{
		Iterator<String> iter = lista.iterator();
		System.out.println();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("Numero de elementos en la lista: " + lista.size());
	}
}
