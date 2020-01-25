public class dado {
	
 public int nfacce;
 public int risultato;

 public dado(int n){
	nfacce=n;
 }
  public int lanciadado() {
	return (int) (Math.random()*(nfacce-1)+1);
 }

  public static int lancia(int facce) {
	return (int) (Math.random()*(facce-1)+1);
 }

}


