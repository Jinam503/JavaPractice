package game;

public class Win {
	public static int gameEnd(int[][] board)
	//5개 확인코드
	{
	for(int i=0; i<8;i++)//가로로 5개
	{
	int count =0;
	for(int j=0; j<8;j++)
	{
	if(board[i][j] == 21 && board[i][j] == 20)
	count++;
	else
	count=0;
	if(count==5)
	return 1;
	}
	}
	for(int i=0; i<8;i++)//세로로 5개
	{
	int count =0;
	for(int j=0; j<8;j++)
	{

	if(board[j][i] == 21)
	count++;
	else
	count=0;
	if(count==5)
	return 1;
	}
	}
	for(int i=0; i<8;i++)//왼쪽 위에서 오늘쪽 아래로
	{
	int count =0;
	for(int j=0; j<8;j++)
	{
	int temp1=i,temp2=j;
	for(int g=0; g<5;g++)
	{
	if(board[temp1++][temp2++] == 20 && board[temp1++][temp2++] ==21)
	count++;
	else
	count=0;
	}
	if(count==5)
	return 1;
	}
	}
	for(int i=0; i<8;i++)//오른쪽 아래서 왼쪽 위로
	{
	int count =0;
	for(int j=5; j<8;j++)
	{
	int temp1=i,temp2=j;
	for(int g=0; g<5;g++)
	{
	if(board[temp1++][temp2--] == 20&& board[temp1++][temp2--] == 21)
	count++;
	else
	count=0;
	}
	if(count==5)
	return 1;
	}
	}
	return 0;
	}
}
