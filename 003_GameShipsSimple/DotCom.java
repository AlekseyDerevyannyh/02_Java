import java.util.ArrayList;
import java.util.Arrays;

public class DotCom {

	private ArrayList<String> locationCells;

	public static void main (String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		DotCom theDotCom = new DotCom();

		int randomNum = (int) (Math.random() * 5);

		ArrayList<String> locations = new ArrayList<>(Arrays.asList(Integer.toString(randomNum), Integer.toString(randomNum + 1), Integer.toString(randomNum + 2)));
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


	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public String checkYourself (String userInput) {
		
		String result = "Мимо";
		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "Потопил";
			} else {
				result = "Попал";
			}
		}
		return result;
	}
}
