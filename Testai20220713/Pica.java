
public class Pica {

	private Dydis dydis;
	private Integer suriai;
	private Integer peperoni;

	public Pica(Dydis dydis, Integer suriai, Integer peperoni) {

		this.dydis = dydis;
		this.suriai = suriai;
		this.peperoni = peperoni;
	}

	public Pica() {
	}

	public Dydis getDydis() {
		return dydis;
	}

	public void setDydis(Dydis dydis) {
		this.dydis = dydis;
	}

	public Integer getSuriai() {
		return suriai;
	}

	public void setSuriai(Integer suriai) {
		this.suriai = suriai;
	}

	public Integer getPeperoni() {
		return peperoni;
	}

	public void setPeperoni(Integer peperoni) {
		this.peperoni = peperoni;
	}

	public Integer skaiciuotiKaina() {

		Integer kaina = 0;

		if (dydis.equals(dydis.mazas)) {
			kaina += 11;

		} else if (dydis.equals(dydis.vidutinis)) {
			kaina += 12;

		} else if (dydis.equals(dydis.didelis)) {
			kaina += 14;
		}

		kaina += peperoni * 2;
		kaina += suriai * 2;

		return kaina;
	}

}
