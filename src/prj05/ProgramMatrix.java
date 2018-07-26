package prj05;

import java.util.Arrays;

public class ProgramMatrix {

	public static void main(String[] args) {
		
		int [][] matrix=new int [10][10];
		//matrix[0]=new int [3];
		//matrix[1]=new int [6];
		//matrix[2]=new int [2];
		for (int  i= 0;  i< matrix.length;i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=i*j;
			}
		}
		int sum = 0;
		int[]rowSumMas=new int [matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			//обработка до просмотра всех €чеек и строки
			int rowSum=0;
			//-------------------------------------------
			for (int j = 0; j < matrix[i].length; j++) {
				//обработка каждой j €чейки 
				
				rowSum=rowSum+matrix[i][j];
				System.out.print("|   "+matrix[i][j]+"\t");
				//-------------------------
			}
			//обработка после просмотра всех €чеек и сток.
			rowSumMas[i]=rowSum;
			sum=sum+rowSum;
			System.out.println("rowSum = "+rowSum);
			System.out.println();
			//------------------------------
		}
		System.out.println("sum = "+sum);
		for (int i = 0; i < rowSumMas.length; i++) {
			System.out.println(rowSumMas[i]);
		}
		for (int i = 0; i < rowSumMas.length; i++) {
			for (int ii = 0;ii < rowSumMas.length-1-i; ii++) {
				if(rowSumMas[ii]>rowSumMas[ii+1]);
				{
					int temp= rowSumMas[ii];
					int[] tempRow=matrix[ii];
					
					rowSumMas[ii]=rowSumMas[ii+1];
					matrix[ii]=matrix[ii+1];		
					
					rowSumMas[ii+1]=temp;
					matrix[ii+1]=tempRow;
				}
			}
		}
		System.out.println(Arrays.toString(rowSumMas));
		System.out.println(Arrays.deepToString(matrix));
	}
}

