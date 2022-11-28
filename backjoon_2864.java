import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2864 {

	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String line = sc.readLine();
		String maxlineString[] = (line.replace("5", "6")).split(" ");
		String minlineString[] = (line.replace("6", "5")).split(" ");
		int max = Integer.parseInt(maxlineString[0]) + Integer.parseInt(maxlineString[1]);
		int min = Integer.parseInt(minlineString[0]) + Integer.parseInt(minlineString[1]);
		String result = "" + min + " " + max;
		System.out.println(result);

	}
}