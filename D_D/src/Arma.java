import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arma {
    
	public String nome;
	public int dBase;
	public int magia;
	public boolean elemento;
	public String elem;
	public boolean tipo; 
	public String tip;
	public float dTot;
	
	public Arma() {
		int tmp;
		tmp = (int)(Math.random() * 2);
		if(tmp==0) {
			elemento = false;
			elem = "non ha un elemento";
		} else {
			elemento = true;
			elem = "ha un elemento";
		}
		tmp = (int)(Math.random() * 2);
		if(tmp==0) {
			tipo = false;
			tip = "ed è a una mano";
		} else {
			tipo = true;
			tip = "ed è a due mani";
		}
		dBase = (int) (Math.random() * 8 + 1);
		magia = (int) (Math.random() * 5 + 1);
		dTot = dBase + magia;
		if (elemento) {
			dTot += (int) (Math.random() * 6 + 1);
		}
		if (tipo) {
			dTot = dTot * 1.5f;
		}
	}
	
	public void nominaArma() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Inserisci il nome della tua arma: ");
		nome = tastiera.readLine();
	}
	
	public void mostraArma() {
		System.out.println(" ");
		System.out.println("La tua arma si chiama "+this.nome+", "+this.elem+" "+this.tip);
		System.out.println(" ");
	}
}
