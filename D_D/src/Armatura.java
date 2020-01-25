
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armatura {
	public String nome;
	public int CA;
	public String tipo;

	public Armatura() {
		CA = (int) (Math.random() * 8 + 1);
		switch (this.CA) {
		case 1:
			tipo = "imbottita";
			break;
		case 2:
			tipo = "di cuoio";
			break;
		case 3:
			tipo = "di ferro";
			break;
		case 4:
			tipo = "di acciaio";
			break;
		case 5:
			tipo = "orchesca";
			break;
		case 6:
			tipo = "elfica";
			break;
		case 7:
			tipo = "di pelle di drago";
			break;
		default:
			tipo = "daedrica";
	}
	}

	public void nominaArmatura() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Inserisci il nome della tua armatura: ");
		nome = tastiera.readLine();
	}

	public void mostraArmatura() {
		System.out.println(" ");
		System.out.println("La tua armatura si chiama " + this.nome + " ed è "+this.tipo);
		System.out.println(" ");
	}
}
