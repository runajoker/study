package saturday;


class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        int check = -1;
        int max = 0;
        // 함수를 완성하세요.

        for( int cols = 0; cols < size; cols++ ) {
        	int lastCol = -1;
        	for( int rows = 0; rows < 4 ; rows++ ) {
        		if( rows != check ) {
        			if( board[cols][rows] > max ) {
        				max = board[cols][rows];
                		lastCol = rows;
        			}
            		
            	}
        		
        	}
        	check = lastCol;
    		result+= max;
    		max = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}