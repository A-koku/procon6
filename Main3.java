import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long sum = 0L;
		if(B-A<0) {
			System.out.println(0);
			System.exit(0);
		}
		long i = A;
		for(;i < B;i++) {
			if(i % K == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
