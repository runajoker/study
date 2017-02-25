import java.util.Scanner;

public class BestSquareSize {

	public static void main(String[] args) {
		BestSquareSize bss = new BestSquareSize();
		bss.getBestSize();
	}
	
	private void getBestSize() {
		Scanner sc = new Scanner(System.in);
		
		int col, row;
		col = sc.nextInt();
		row = sc.nextInt();
		int[][] matrix = new int[col][row];
		int maxSize = -1;
		for(int index1= 0;index1 < col; index1++) {
			for(int index2 = 0;index2 < row; index2++) {
				matrix[index1][index2] = sc.nextInt();
			}
		}
		
		for(int index1= 0;index1 < col; index1++) {
			for(int index2 = 0;index2 < row; index2++) {
				if(matrix[index1][index2] == 0) {
					for(int idx = index2;idx< row; idx++) {
						
					}
				} else if (matrix[index1+1][index2] == 0 && matrix[index1][index2] == 0) {
				
				}
				
				System.out.print(matrix[index1][index2]+" ");
			}System.out.println();
		}
		
	}
}
