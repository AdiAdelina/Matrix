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
		{ if (matrix[i][j]%2==0)
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
		{ if (matrix[i][j]%2!=0)
			nr1=nr1+1;
		}
	
	}
	return nr1;
	}
	
	
	
		
	
	
	
	
	
	
}
	
	
	
	

	
	
	