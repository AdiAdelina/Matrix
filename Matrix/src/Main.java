

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
		writer.println("Suma matrice= "+workSquare.SumaMatrix());
		writer.println( "Elementul maxim este "+ workSquare.Maxim());
		writer.println("Elementul minim este "+workSquare.Minim());
		writer.print("Numerele impare : ");
		for (int i = 0; i < workSquare.AfisImpare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisImpare(matrix)[i] + " ");
		}
		
		for (int i = 0; i < workSquare.AfisPare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPare(matrix)[i] + " ");
		}
		
		writer.println();
		writer.println("ok");
		writer.close();
	}
	
}
