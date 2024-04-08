package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crear una clase Cuenta con un método llamado “cuentaPalabras()” que cuente las
palabras existentes en un archivo de texto pasado como parámetro.
El método recibirá como parámetro un objeto File y retornará la cantidad de palabras que
componen el texto.
El proceso será ir leyendo líneas del archivo y contar cuantas palabras hay en cada una.
Recordad que esto lo hicimos con un StringTokenizer.
*/
		
		cuentaPalabras("quijote.txt");
	}
	
	public static void cuentaPalabras(String string) {
		File archivo = new File(string);
		BufferedReader stream = null;
		try {
			stream = new BufferedReader(new FileReader(archivo));	
			String linea;
			while ( (linea  = stream.readLine()) != null ) {
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
