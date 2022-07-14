import java.util.ArrayList;

public class Uzsakymas {

	private String uzsakymoNr;
	private ArrayList<Pica> picos;

	public Uzsakymas(String uzsakymoNr, ArrayList<Pica> picos) {

		this.uzsakymoNr = uzsakymoNr;
		this.picos = picos;
	}

	public Uzsakymas() {
	}

	public String getUzsakymoNr() {
		return uzsakymoNr;
	}

	public void setUzsakymoNr(String uzsakymoNr) {
		this.uzsakymoNr = uzsakymoNr;
	}

	public ArrayList<Pica> getPicos() {
		return picos;
	}

	public void setPicos(ArrayList<Pica> picos) {
		this.picos = picos;
	}

	public Integer skaiciuotiUzsakymoSuma() throws NullPointerException {

		Integer suma = 0;

		if (picos.isEmpty()) {
			throw new NullPointerException("tuscias sarasas");

		} else {

			for (int i = 0; i < picos.size(); i++) {

				suma += picos.get(i).skaiciuotiKaina();
			}
		}
		return suma;

	}

}
