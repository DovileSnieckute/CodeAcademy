import java.util.ArrayList;
import java.util.Scanner;

public class Testai {

	public Integer maziausias(ArrayList<Integer> numbers) throws Exception {

		if (numbers.isEmpty()) {
			throw new NullPointerException("tuscias sarasa");
		}

		Integer maziausiasSkaicius = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) < maziausiasSkaicius) {
				maziausiasSkaicius = numbers.get(i);
			}
		}

		return maziausiasSkaicius;

	}

	public Double vidurkis(ArrayList<Integer> skaiciai) {

		Double suma = 0.0;

		for (int i = 0; i < skaiciai.size(); i++) {

			suma += skaiciai.get(i);
		}

		Double vidurkis = suma / skaiciai.size();

		return vidurkis;
	}

	public String middle(String zodis) {

		int position;
		int length;

		if (zodis.length() % 2 == 0) {
			position = zodis.length() / 2 - 1;
			length = 2;
		} else {
			position = zodis.length() / 2;
			length = 1;
		}
		return zodis.substring(position, position + length);
	}

	public Integer balses(String zodis) {

		Integer suma = 0;

		String mazosios = zodis.toLowerCase();

		for (int i = 0; i < mazosios.length(); i++) {

			char raide = mazosios.charAt(i);

			if (raide == 'a' || raide == 'e' || raide == 'o' || raide == 'i' || raide == 'y' || raide == 'u') {

				suma++;

			}

		}
		return suma;
	}

	public Integer countWords(String word) {

		Integer sum = 0;

		char ch[] = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {

			ch[i] = word.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				sum++;
		}
		return sum;

	}

}
