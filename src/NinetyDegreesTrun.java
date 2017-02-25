import java.util.Scanner;

public class NinetyDegreesTrun {

	public static void main(String[] args) {
		NinetyDegreesTrun ndt = new NinetyDegreesTrun();
		ndt.turnStart();
	}
	
	public void turnStart(){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		
		for(int index=0; index < size; index++) {
			for(int index2=0;index2 < size; index2++) {
				matrix[index][index2] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int index2 = 0; index2 < size; index2++) {
			for(int index=size-1;index >=0; index--) {
				System.out.print(matrix[index][index2]+" ");
			}System.out.println();
		}
		
	}
}
