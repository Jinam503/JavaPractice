package pack;
import character.Player;
import java.util.Scanner;
import game.Draw;
import game.Win;
public class Test {
	private static int how, x, y;
	private static boolean turn;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("흑 잡을 사람 이름 적어주세요 : ");
		String name1 = in.nextLine();
		System.out.print("백 잡을 사람 이름 적어주세요 : ");
		String name2 = in.nextLine();
		
		Player black = new Player(name1);
		Player white = new Player(name2);
		Draw d = new Draw();
		System.out.print("몇 목 하실건가요? (5목, 6목): ");
		how = in.nextInt();
		d.createBoard();
		d.DrawMap();
		turn = true;
		while(true) {
			if(turn) {
				System.out.println(black.name + "님 차례입니다.");
			}
			else System.out.println(white.name + "님 차례입니다.");
			System.out.println("x좌표를 입력하세요.");
			x = in.nextInt();
			System.out.println("y좌표를 입력하세요.");
			y = in.nextInt();
			if((x<=0 || y > 19 || x <= 0 || y > 19)) {
				d.DrawMap();
				System.out.println("거기는 둘 수 없어용");
				System.out.println("");
				continue;
			}
			if(d.CheckPlace(x, y)) {
				d.DrawMap();
				System.out.println("거기는 돌이 있어용");
				System.out.println("");
				continue;
			}
			
			d.insert(x, y, turn);
			d.DrawMap();
			turn = !turn;
			if(Win.gameEnd(d.board, how) == 1) {
				System.out.println(name1 + "님이 이겼습니다!");
				break;
			}
			else if(Win.gameEnd(d.board, how) == 2) {
				System.out.println(name2 + "님이 이겼습니다!");
				break;
			}
		}
		
		in.close();
	}
}
