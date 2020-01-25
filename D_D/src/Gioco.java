import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gioco {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		String nome, classe, razza, np2, cp2, rp2;
		int tmp;
		System.out.println("Inserisci il nome del tuo personaggio: ");
		nome = tastiera.readLine();
		System.out.println("Inserisci la classe del tuo personaggio: ");
		classe = tastiera.readLine();
		System.out.println("Inserisci la razza del tuo personaggio: ");
		razza = tastiera.readLine();
		Personaggio P1 = new Personaggio(nome, classe, razza);
		P1.mostraCaratteristiche();
		P1.Spada.nominaArma();
		P1.Spada.mostraArma();
		P1.armatura.nominaArmatura();
		P1.armatura.mostraArmatura();
		
		tmp = (int) (Math.random() * 12 + 1);
		switch (tmp) {
		
		case 1:
			np2 = "Rethildi";
			break;
		case 2:
			np2 = "Bando";
			break;
		case 3:
			np2 = "Ferdald";
			break;
		case 4:
			np2 = "Vinroy";
			break;
		case 5:
			np2 = "Garah";
			break;
		case 6:
			np2 = "Bandocas";
			break;
		case 7:
			np2 = "Roccla";
			break;
		case 8:
			np2 = "Fred";
			break;
		case 9:
			np2 = "Charniel";
			break;
		case 10:
			np2 = "Ordcan";
			break;
		case 11:
			np2 = "Annron";
			break;
		default:
			np2 = "Rieard";
		}
		tmp = (int) (Math.random() * 12 + 1);
		switch (tmp) {
		case 1:
			cp2 = "piziorsi";
			break;
		case 2:
			cp2 = "Bardo";
			break;
		case 3:
			cp2 = "Chierico";
			break;
		case 4:
			cp2 = "Druido";
			break;
		case 5:
			cp2 = "Guerriero";
			break;
		case 6:
			cp2 = "Ladro";
			break;
		case 7:
			cp2 = "Mago";
			break;
		case 8:
			cp2 = "Monaco";
			break;
		case 9:
			cp2 = "Paladino";
			break;
		case 10:
			cp2 = "Ranger";
			break;
		case 11:
			cp2 = "Stregone";
			break;
		default:
			cp2 = "Warlock";
		}
		tmp = (int)(Math.random() * 7 + 1 );
		switch(tmp) {
		case 1:
			rp2 = "Tiefling";
			break;
		case 2:
			rp2 = "Elfo";
			break;
		case 3:
			rp2 = "Dragonide";
			break;
		case 4:
			rp2 = "Umano";
			break;
		case 5:
			rp2 = "Kalashtar";
			break;
		case 6:
			rp2 = "Mezzelfo";
			break;
		default:
			rp2 = "Halfling";
			break;
		}
		Personaggio P2 = new Personaggio(np2, cp2, rp2);
		System.out.println("");
		System.out.println("Combatti contro un " + P2.classe + " " + P2.razza + " di nome " + P2.nome + " con armatura "+P2.armatura.tipo);
		System.out.println(" ");
		System.out.println("Premi un tasto per continuare");
		String idk;
		idk = tastiera.readLine();
		P1.combattimento(P2);
	}
}
