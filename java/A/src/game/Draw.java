package game;

public class Draw {
	public int[][] board;
	public void insert(int a, int b, boolean c) {
		if(c) board[a-1][b] = 20;
		else board[a-1][b] = 21;
		
	}
	public void DrawMap() {
		for(int i = 0; i<= 10; i++) {
			for(int j = 0; j<= 10; j++) {
				if(board[i][j] == 0) {
					System.out.print("·"+" ");
				}
				else if(board[i][j] == 20) {
					System.out.print("○"+" ");
				}
				else if(board[i][j] == 21) {
					System.out.print("●"+" ");
				}
				else {
					if(j == 0 && i == 9) {
						System.out.print(board[i][j]);
						continue;
					}
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
	public boolean CheckPlace(int a, int b) {
		
		return (board[a-1][b] != 0) ? true : false;
	}
}
