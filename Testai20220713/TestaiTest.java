import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestaiTest {

	Testai metodas;
	ArrayList<Integer> numbers;
	Pica mazaPica, vidutinePica, didelePica;

	@BeforeEach
	void setUpBeforeClass() throws Exception {

		metodas = new Testai();
		numbers = new ArrayList<>(Arrays.asList(25, 45, 65));

		didelePica = new Pica(Dydis.didelis, 2, 5);
		vidutinePica = new Pica(Dydis.vidutinis, 3, 1);
		mazaPica = new Pica(Dydis.mazas, 0, 1);
	}

	@Test
	void maziausiasTest() throws Exception {

		Integer maziausias = metodas.maziausias(numbers);
		assertEquals(25, maziausias);

	}

	@Test
	void maziausiasTestException() {

		assertThrows(

				NullPointerException.class, () -> metodas.maziausias(new ArrayList<>()),
				"Expected doThing() to throw, but ir didnt");

	}

	@Test
	void vidurkisTest() {

		Double vidurkis = metodas.vidurkis(numbers);
		assertEquals(45.0, vidurkis);

	}

	@Test
	void middleTest() {

		String zodis = "5670";
		String simbolis = metodas.middle(zodis);
		assertEquals("67", simbolis);

	}

	@Test
	void balsesTest() {

		String zodis = "vakaras";
		Integer suma = metodas.balses(zodis);
		assertEquals(3, suma);

	}

	@Test
	void countWordsTest() {

		String zodis = "The quick brown fox jumps over the lazy dog";
		Integer sum = metodas.countWords(zodis);
		assertEquals(9, sum);

	}

	@Test
	void menesiaiTest() {

		UzduotisDiagram diagram = new UzduotisDiagram();
		Integer skaicius = 13;
		String menesis = diagram.menesiai(skaicius);
		assertEquals("netinkamas skaicius", menesis);

	}

	@Test
	void skaiciuotiKainaTest() {

		Integer kaina = mazaPica.skaiciuotiKaina();
		assertEquals(13, kaina);

	}

	@Test
	void skaiciuotiUzsakymoSumaTestException() {

		Uzsakymas uzs = new Uzsakymas("112", new ArrayList<>());

		assertThrows(

				NullPointerException.class, () -> uzs.skaiciuotiUzsakymoSuma());

	}

	@Test
	void skaiciuotiUzsakymoSumaTest() throws NullPointerException {

		ArrayList<Pica> picos = new ArrayList<>(Arrays.asList(mazaPica, vidutinePica, didelePica));

		Uzsakymas uzs = new Uzsakymas("112", picos);

		Integer suma = uzs.skaiciuotiUzsakymoSuma();

		assertEquals(61, suma);
	}

}
