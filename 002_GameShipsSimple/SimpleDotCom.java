import java.io.*

public class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;

	public static void main (String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();

		int randomNum = (int) (Math.random() * 5);

		int[] locations = {randomNum, randomNum + 1, randomNum + 2};

		theDotCom.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive) {
			String guess = helper.getUserInput("Введите число");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses ++;

			if (result.equals("Потопил")) {
				isAlive = false;
				System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
			}
		}
	}


	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself (String stringGuess) {
		
		int guess = Integer.parseInt(stringGuess);
		String result = "Мимо";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "Попал";
				numOfHits ++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "Потопил";
		}

		System.out.println(result);

		return result;
	}

}

public class SimpleDotComTestDrive {

	public static void main (String[] args) {

		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {2, 3, 4};

		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "Неудача";

		if (result.equals("Попал") {
			testResult = "Пройден";
		}

		System.out.println(testResult);

	}
}

public class GameHelper {
	public String getUserInput (String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)	return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}
