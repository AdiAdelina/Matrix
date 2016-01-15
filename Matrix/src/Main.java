

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("Matrix/src/out.txt", "UTF-8");
		
		int[][] matrix = readMatrix.getMatrix();
		
		writer.print(readMatrix.toString());
		
		writer.println( "Elementul maxim este "+ workSquare.Maxim());
		writer.println("Elementul minim este "+workSquare.Minim());
		writer.print("Numerele impare sunt : ");
		for (int i = 0; i < workSquare.AfisImpare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisImpare(matrix)[i] + " ");
		}
		writer.println(); 
		writer.println("Numarul elementelor impare :"+ workSquare.CateImpare());
		
		writer.print("Numerele pare sunt:");
		for (int i = 0; i < workSquare.AfisPare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPare(matrix)[i] + " ");
		}
		writer.println();  
		
		writer.println("Numarul elementelor pare: "+ workSquare.CatePare());
		
		/*writer.println ("Numerele palindrom sunt:");
		for (int i = 0; i < workSquare.AfisPalindrom(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPalindrom(matrix)[i] + " ");
		}
		*/
		
		writer.println ("Sume:");
		writer.println("Suma matrice= "+workSquare.SumaMatrix());
		writer.println("Suma elementelor impare este = "+ workSquare.SumaImpare());
		writer.println("Suma elementelor pare este = "+ workSquare.SumaPare());
		
		writer.println();
		writer.println();
		
		if (matrix.length==matrix[0].length)				// Verificare matrice patratica
			writer.println("Matricea este patratica");
		writer.println();
		
		
		
		
		
		
		
		
		writer.println();
		writer.println("gata");
		writer.close();
	}
	
}
