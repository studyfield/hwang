import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(sc.readLine());

		String[] A = new String[a];
		for (int q = 0; q < A.length; q++) {
			A[q] = sc.readLine();
		}

		int sum = 0;
		int countup = 0;
		for (int z = 0; z < A.length; z++) {
			String[] B = A[z].split("");
			for (int z1 = 0; z1 < B.length; z1++) {
				if (B[z1].equals("O")) {
					countup++;
					sum += countup;
				} else {
					countup = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
			countup = 0;
		}

	}

}