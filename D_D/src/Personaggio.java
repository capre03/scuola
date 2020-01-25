public class Personaggio {
	public int livello;
	public String classe;
	public String nome;
	public String razza;
	public float hp;
	public int difesa;
	public int TxC;
	public int modF;
	public int modDes;
	public int modCos;
	public int modInt;
	public int modSag;
	public int modCar;
	public int forza = 0;
	public int destrezza = 0;
	public int costituzione = 0;
	public int intelligenza = 0;
	public int saggezza = 0;
	public int carisma = 0;
	public Arma Spada;
	public Armatura armatura;

	public Personaggio(String n, String c, String r) {
		Spada = new Arma();
		armatura = new Armatura();
		for (int i = 0; i < 3; i++) {
			forza += (int) (Math.random() * 8 + 1);
			destrezza += (int) (Math.random() * 8 + 1);
			costituzione += (int) (Math.random() * 8 + 1);
			intelligenza += (int) (Math.random() * 8 + 1);
			saggezza += (int) (Math.random() * 8 + 1);
			carisma += (int) (Math.random() * 8 + 1);
		}
		livello = (int) (Math.random() * 20 + 1);
		nome = n;
		classe = c;
		razza = r;
		modF = (forza - 10) / 2;
		modDes = (destrezza - 10) / 2;
		modCos = (costituzione - 10) / 2;
		modInt = (intelligenza - 10) / 2;
		modSag = (saggezza - 10) / 2;
		modCar = (carisma - 10) / 2;
		hp = ((int) (Math.random() * 20 + 1) + modCos) * livello;
		difesa = 10 + modDes + this.armatura.CA;
	}

	public void mostraCaratteristiche() {
		System.out.println("");
		System.out.println(this.nome + " è un " + this.classe + " " + this.razza);
		System.out.println("");
		System.out.println("Caratteristiche: ");
		System.out.println("-Livello: "+this.livello);
		System.out.println("-Forza: "+this.forza);
		System.out.println("-Destrezza: "+this.destrezza);
		System.out.println("-Costituzione: "+this.forza);
		System.out.println("-Saggezza: "+this.saggezza);
		System.out.println("-Carisma: "+this.carisma);
		System.out.println("-Difesa: "+this.difesa);
		System.out.println("Punti vita totali: "+this.hp);
		System.out.println("");
	}

	public int trovaTxC() {
		int TxC;
		TxC = (int) (Math.random() * 20 + 1) + livello + modF + this.Spada.magia;
		return TxC;
	}

	public void combattimento(Personaggio P2) {
		int turni = 1;
		boolean v1 = false;
		boolean v2 = false;
		do {
			this.TxC = trovaTxC();
			if (this.TxC >= P2.difesa) {
				P2.hp = P2.hp - this.Spada.dTot;
				System.out.println("Turno " + turni);
				System.out.println(this.nome + " ha tolto " + this.Spada.dTot + " punti vita a " + P2.nome);
				System.out.println("Ora " + P2.nome + " ha " + P2.hp + " punti vita");
				System.out.println("");
				if (P2.hp < 0) {
					v1 = true;
					break;
				}
			} else {
				System.out.println("Turno " + turni);
				System.out.println("Ops! " + this.nome + " ha mancato " + P2.nome);
				System.out.println("Ora " + P2.nome + " ha " + P2.hp + " punti vita");
				System.out.println("");
			}
			P2.TxC = trovaTxC();
			if (P2.TxC >= this.difesa) {
				this.hp = this.hp - P2.Spada.dTot;
				turni++;
				System.out.println(P2.nome + " ha tolto " + P2.Spada.dTot + " punti vita a " + this.nome);
				System.out.println("Ora " + this.nome + " ha " + this.hp + " punti vita");
				System.out.println("");
				if (this.hp < 0) {
					v2 = true;
					break;
				} else {
					turni++;
					System.out.println("Ops! " + P2.nome + " ha mancato " + this.nome);
					System.out.println("Ora " + this.nome + " ha " + this.hp + " punti vita");
					System.out.println("");
				}
			}
		} while (!((v1 = false) && (v2 = false)));
		if (v1 == true) {
			System.out.println("Ha vinto " + this.nome);
		} else {
			System.out.println("Ha vinto " + P2.nome);
		}
	}
}
