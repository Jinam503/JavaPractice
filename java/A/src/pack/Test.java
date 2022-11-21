package pack;
import character.Player;
import java.util.Scanner;
import game.Draw;
public class Test {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("흑 잡을 사람 이름 적어주세요 : ");
		String name1 = in.nextLine();
		System.out.print("백 잡을 사람 이름 적어주세요 : ");
		String name2 = in.nextLine();
		
		Player black = new Player(name1);
		Player white = new Player(name2);
		Draw d = new Draw();
		d.board = new int[11][11];
		for(int i = 1; i<=10; i++) d.board[i-1][0] = i;
		for(int i = 1; i<=10; i++) d.board[10][i] = i;
		boolean turn = true;
		int a,b,c=0;
		d.DrawMap();
		while(true) {
			if(turn) {
				System.out.println(black.name + "님 차례입니다.");
			}
			else System.out.println(white.name + "님 차례입니다.");
			System.out.println("x좌표를 입력하세요.");
			a = in.nextInt();
			System.out.println("y좌표를 입력하세요.");
			b = in.nextInt();
			if(d.CheckPlace(a, b)) {
				d.DrawMap();
				System.out.println("거기는 돌이 있어용");
				System.out.println("");
				continue;
			}
			d.insert(a, b, turn);
			d.DrawMap();
			turn = !turn;
			if(c == 1)break;
		}
		
		in.close();
	}
}
