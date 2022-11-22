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
		System.out.print("몇 목 하실건가요? (3목, 5목, 6목): ");
		int how = in.nextInt();
		d.createBoard();
		
		
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
			if(a<=0 || a > 10 || b <= 0 || a > 10) {
				d.DrawMap();
				System.out.println("거기는 둘 수 없어용");
				System.out.println("");
				continue;
			}
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
