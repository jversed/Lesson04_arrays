package prj05;

public class TaskArrays {

	public static void main(String[] args) {
		
		int[] mas = new int[10]; // creating new massive named "mas"
		for (int i = 1; i<10;i++) // going through mas from 0 to 9
			mas[i]=i; // each next cell getting nember = index
		
			for(int i= 0;i< mas.length;i++)
				System.out.println(mas[i]); // showing on console every cell of array 

			}
	}