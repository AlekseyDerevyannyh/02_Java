import java.util.ArrayList;
import java.util.Arrays;

public class DotComTestDrive {
	public static void main (String[] args) {

		DotCom dot = new DotCom();

		ArrayList<String> locations = new ArrayList<>(Arrays.asList("2", "3", "4"));
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "Неудача";

		if (result.equals("Попал")) {
			testResult = "Пройден";
		}

		System.out.println(testResult);
	}
}
