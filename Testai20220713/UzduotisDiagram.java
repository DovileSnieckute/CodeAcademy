
public class UzduotisDiagram {


	public String menesiai(Integer skaicius) {

		String menesis = "";

		if (skaicius > 0) {
			if (skaicius < 13) {
				if (skaicius % 2 == 0) {
					switch (skaicius) {
					case 2:
						menesis = "VASARIS";
						break;
					case 4:
						menesis = "BALANDIS";
						break;
					case 6:
						menesis = "BIRZELIS";
						break;
					case 8:
						menesis = "RUGPJUTIS";
						break;
					case 10:
						menesis = "SPALIS";
						break;
					case 12:
						menesis = "GRUODIS";
						break;
					}
				} else {
					switch (skaicius) {
					case 1:
						menesis = "SAUSIS";
						break;
					case 3:
						menesis = "KOVAS";
						break;
					case 5:
						menesis = "GEGUZE";
						break;
					case 7:
						menesis = "LIEPA";
						break;
					case 9:
						menesis = "RUGSEJIS";
						break;
					case 11:
						menesis = "LAPKRITIS";
						break;
					}
				}
			} else {
				menesis = "netinkamas skaicius";
			}
		} else {
			menesis = "netinkamas skaicius";
		}
		return menesis;
	}

}
