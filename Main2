import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		//配列作成
		String hantai[] = {"GC","CP","PG"};
		//文字列のかけら
		String kakera = S;
		int result = 0;
		//勝ちの組みのなかで一番手前で存在してるものを抽出
		int min = 300001;
		String kore = "";
//		int count = 0;
		for(int i = 0;i < S.length();i++) {
			for(int kati = 0;kati < hantai.length;kati++) {
					//文字列にGCはいってる場所値で渡す
					result = kakera.indexOf(hantai[kati]);
//					//結果が整数なら通す
					if (result != -1) {

						if( Math.min(min, result)==result) {
							kore = hantai[kati];
							min = Math.min(min, result);

						}

					}

			}
			//勝ちの組みを抽出
			kakera = kakera.replaceFirst(kore, "");
			kore = "";

		}

		System.out.println(kakera.length());



	}

}
