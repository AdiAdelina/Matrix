import java.util.Arrays;

public class WorkMatrix {
	private int[][] matrix;

	public WorkMatrix(int[][] matrix) {
		this.setMatrix(matrix);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
		
	}
	int[] addElement(int[] org, int added) {
		int[] result = Arrays.copyOf(org, org.length + 1);
		result[org.length] = added;
		return result;
	}
	
	
	
	public int SumaMatrix(){
		int s = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				s=s+matrix[i][j];
			}
		}
		return s;
	
	}
	
	public int Maxim() 
	{
			int max= matrix[0][0];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++){
					if (matrix[i][j]>max)
						max=matrix[i][j];}
				}
			return max;
	}
	
	
	public int Minim()
	{ int min=matrix[0][0];
	for (int i=0; i<matrix.length;i++)
	{
		for (int j=0;j< matrix.length;j++)
	{
			if (matrix [i][j]<min)
		min=matrix[i][j];}
	}
	return min;
	} 
	
	
	
	
	public int[] AfisImpare(int[][] matrix) // afiseaza elementele impare
	{
		int[] temp = new int[0];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 != 0)
				{
					temp = addElement(temp, matrix[i][j]);

				}
			}
		}
		return temp;
	}
	
	public int CateImpare ()
	{ int  nr=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
		{ if (matrix[i][j]%2!=0)
			nr=nr+1;
		}
	}
	return nr;
	} 

	
	public int [] AfisPare (int[][]matrix) // afis elem pare
	{ int [] par= new int [0];
	for (int i=0;i<matrix.length;i++) {
		for (int j=0; j<matrix.length; j++) {
			if (matrix[i][j]%2==0)
			{ par=addElement (par, matrix [i][j]);
			
			}
		}
	}
	return par;
	} 
	
	
	public int CatePare ()
	{ int nr1=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
		{ if (matrix[i][j]%2==0)
			nr1=nr1+1;
		}
	
	}
	return nr1;
	}
	
	
/*	public int AfisPalindrom (int[][]matrix) //Afis nr palindrom  // Are ceva asta!!!!
	{int [] palindrom =new int [0];
	int ni=0, y;
	
	for (int i=0;i<matrix.length;i++)
	{
		for (int j=0; j<matrix.length; j++)
		{ y=matrix [i][j];
		while (matrix [i][j]!=0)
			{ni=ni*10+matrix[i][j]%10;
		matrix [i][j]=matrix[i][j]/10;}
		if (ni==y)
			palindrom=addElement (palindrom, matrix [i][j]);
		}
		
			
		
		}
	return palindrom; 
	}
	*/
	
	
	public int SumaImpare ()
	{ int  s=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
		{ if (matrix[i][j]%2!=0)
			s=s+matrix [i][j];
		}
	}
	return s;
	} 
	


	public int SumaPare ()
	{ int  s=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
		{ if (matrix[i][j]%2==0)
			s=s+matrix [i][j];
		}
	}
	return s;
	} 
	
	
	
	//Matrice patratica
	
	public int SumaDiagPrinc ()
	{ int s=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
			if (i==j)
				s=s+matrix [i][j];}
	return s;
	}
		
	public int SumaDiagSec ()
	{ int s=0;
	for (int i = 0; i < matrix.length; i++) 
	{
		for (int j = 0; j < matrix.length; j++)
			if (i+j==matrix.length+1)
				s=s+matrix [i][j];}
	return s;
	}
	
	public int SumaDeasupraDiagPrinc ()
	{ int s=0;
	for (int i = 0; i < matrix.length-1; i++) 
	{
		for (int j = i+1; j < matrix.length; j++)
			s=s+matrix [i][j];}
			
				
	return s;
	}
	
	public int SumaDeasupraDiagSec ()
	{ int s=0;
	for (int i = 0; i < matrix.length-1; i++) 
	{
		for (int j = 1; j < matrix.length-i; j++)
			s=s+matrix [i][j];}
			
				
	return s;
	}
	
/*	public int EgalitateSumaDiagonale ()
	{ int s;
	if (SumaDiagPrinc()==SumaDiagSec())
		return s;
		
	}*/
	
}
	
	
	
	

	
	
	