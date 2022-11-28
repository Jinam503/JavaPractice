package game;

public class Win {
	public static int gameEnd(int[][] board) {
		for(int i = 1; i <= 19; i++) {//가로 확인
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == 5) return 1;
				if(count2 == 5) return 2;
				if(board[i][j] == 20 && count2 == 0) count1 ++;
				else if(board[i][j] == 21 && count1 == 0) count2++;
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {//가로 확인
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == 5) return 1;
				if(count2 == 5) return 2;
				if(board[j][i] == 20 && count2 == 0) count1 ++;
				else if(board[j][i] == 21 && count1 == 0) count2++;
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {//가로 확인
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				int tempx, tempy = 0;
				if(count1 == 5) return 1;
				if(count2 == 5) return 2;
				if(board[i][j] == 20) {
					count1++;
					for(int k = 0; k < 5; k++) {
						if(board[i++][j++] == 20) count1++;
						else break;
					}
				}
				else if(board[i][j] == 21) {
					count2++;
					for(int k = 0; k < 5; k++) {
						if(board[i++][j++] == 20) count2++;
					}
				}
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		return 0;
	}
	
}