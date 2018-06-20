import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String nengou = "MTSHX";
		//split
		String nengouSplit[] = nengou.split("");
		String strSplit[] = str.split("");
		//年号確定
		String nenkaku = "";
		for(int i = 0;i < nengouSplit.length;i++)
		{
			if(nengouSplit[i].equals(strSplit[0])) {
				nenkaku = nengouSplit[i];

				break;
			}
		}
		if(str.length()==2) {
		if(nenkaku.equals("M")) {
			System.out.println(1868+Integer.parseInt(strSplit[1])-1);
		}
		if(nenkaku.equals("T")) {
			System.out.println(1912+Integer.parseInt(strSplit[1])-1);

		}
		if(nenkaku.equals("S")) {
			System.out.println(1926+Integer.parseInt(strSplit[1])-1);

		}
		if(nenkaku.equals("H")) {
			System.out.println(1989+Integer.parseInt(strSplit[1])-1);

		}
		if(nenkaku.equals("X")) {
			System.out.println(2019+Integer.parseInt(strSplit[1])-1);

		}
		//System.out.println(nenkaku);
		}
		if(str.length()==3) {
			if(nenkaku.equals("M")) {
				System.out.println(1868+Integer.parseInt(strSplit[1])*10+Integer.parseInt(strSplit[2])-1);
			}
			if(nenkaku.equals("T")) {
				System.out.println(1912+Integer.parseInt(strSplit[1])*10+Integer.parseInt(strSplit[2])-1);

			}
			if(nenkaku.equals("S")) {
				System.out.println(1926+Integer.parseInt(strSplit[1])*10+Integer.parseInt(strSplit[2])-1);

			}
			if(nenkaku.equals("H")) {
				System.out.println(1989+Integer.parseInt(strSplit[1])*10+Integer.parseInt(strSplit[2])-1);

			}
			if(nenkaku.equals("X")) {
				System.out.println(2019+Integer.parseInt(strSplit[1])*10+Integer.parseInt(strSplit[2])-1);

			}
			//System.out.println(nenkaku);
		}

	}

}
