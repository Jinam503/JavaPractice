package game;

public class Draw {
	public int[][] board;
	public void insert(int a, int b, boolean c) {
		if(c) board[a][b] = 20;
		else board[a][b] = 21;
		
	}
	public void createBoard() {
		board = new int[20][20];
		for(int i = 1; i<=19; i++) board[i][0] = i;
		for(int i = 1; i<=19; i++) board[0][i] = i;
	}
	public void DrawMap() {
		int A,B ;
		A = 19; 
		B = 19;
		for(int i = 0; i<= A; i++) {
			for(int j = 0; j<= B; j++) {
				if(board[i][j] == 0) {
					System.out.print("·"+"   ");
				}
				else if(board[i][j] == 20) {
					System.out.print("●"+"   ");
				}
				else if(board[i][j] == 21) {
					System.out.print("○"+"   ");
				}
				else {
					if(j == 0 && i >= 10) {
						System.out.print(board[i][j] + "  ");
						continue;
					}
					else if(i == 0 &&j >= 10) {
						System.out.print(board[i][j] + "  ");
						continue;
					}
					System.out.print(board[i][j] + "   ");
				}
			}
			System.out.println("");
			System.out.println("");
		}
	}
	public boolean CheckPlace(int a, int b) {
		
		return (board[a][b] != 0) ? true : false;
	}
}
