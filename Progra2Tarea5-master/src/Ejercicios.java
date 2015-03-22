import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
		{
			PrintWriter I= new PrintWriter(nombre_archivo);
			I.println(contenido); 
			I.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try
		{
			PrintWriter n= new PrintWriter(nombre_archivo);
			n.println(contenido); 
			n.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
	    int n;
	    Scanner sc=new Scanner(System.in);
	    
	    try
	    {
		n=sc.nextInt();
		System.out.println(n);
		sc.close();
		
		return n;
	 }catch(Exception e)
	{
		e.printStackTrace();
	}	
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			s=sc.next();
			System.out.println(s);
			sc.close();

			return s;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		double n;
		Scanner sc= new Scanner(System.in);
		
		try
		{
		n=sc.nextDouble();
		System.out.println(n);
		sc.close();
		
		return n;
		
		}catch( Exception e)
		{
			e.printStackTrace();
		}
		
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		String p;
		int cont=0;
		
  
		try{
			Scanner sc = new Scanner(new File(nombre_archivo));
		
			while(sc.hasNext())
			{
			p= sc.next();
			if(p.equals(buscada)) cont = cont +1;
			}
			System.out.println(cont);
			sc.close();
		
			return cont; 	
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		return -1;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
				int suma=0;
				int cont=0;
				
				try{
					
					Scanner sc = new Scanner(new File(nombre_archivo));
					
					while(sc.hasNextInt())
					{

						suma = suma + sc.nextInt();
						cont = cont+1;
					}
					
					int prom;
					prom = suma/cont;
	
					System.out.println(prom);
					sc.close();
		
					return prom;
				}catch (FileNotFoundException e){
					e.printStackTrace();
				}
				return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
