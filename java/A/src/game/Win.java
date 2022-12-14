package game;

public class Win {
	public static int gameEnd(int[][] board, int how) {
		for(int i = 1; i <= 19; i++) {//가로 확인
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == how) return 1;
				if(count2 == how) return 2;
				if(board[i][j] == 20 && count2 == 0) count1 ++;
				else if(board[i][j] == 21 && count1 == 0) count2++;
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {//세로 확인
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == how) return 1;
				if(count2 == how) return 2;
				if(board[j][i] == 20 && count2 == 0) count1 ++;
				else if(board[j][i] == 21 && count1 == 0) count2++;
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {//왼쪽 위에서 오른쪽 아래로
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == how) return 1;
				if(count2 == how) return 2;
				if(board[i][j] == 20) {
					for(int k = 0; k < how; k++) {
						if(board[i++][j++] == 20) count1++;
						else break;
					}
				}
				else if(board[i][j] == 21) {
					for(int k = 0; k < how; k++) {
						if(board[i++][j++] == 21) count2++;
					}
				}
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {//오른쪽 위에서 왼쪽 아래로
			int count1 = 0;
			int count2 = 0;
			for(int j = 1; j<=19; j++) {
				if(count1 == how) return 1;
				if(count2 == how) return 2;
				if(board[i][j] == 20) {
					for(int k = 0; k < how; k++) {
						if(board[i++][j--] == 20) count1++;
						else break;
					}
				}
				else if(board[i][j] == 21) {
					for(int k = 0; k < how; k++) {
						if(board[i++][j--] == 21) count2++;
					}
				}
				else {
					count1 = 0;
					count2 = 0;
				}
			}
		}
		for(int i = 1; i <= 19; i++) {
			
		}
		return 0;
	}
	
}