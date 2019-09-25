package lienCompte;

public class CompteBancaire {
	
	private int solde;
	
	public CompteBancaire (int val) {
		if (val < 0) throw new IllegalArgumentException ("solde négatif !");
		solde = val;
	}
	
	public CompteBancaire () {
		solde = 0;
	}
	
	public int getSolde () {
		return solde;
	}

	public void credit(int i) {
		if (i < 0) throw new IllegalArgumentException ("crédit d'une somme négative");
		solde = solde + i;
	}

	public void debit(int i) {
		if (i > solde) throw new IllegalArgumentException ("compte à découvert");
		if (i < 0) throw new IllegalArgumentException ("debit d'une somme négative");
		solde = solde - i;
		
	}

	public void virement(CompteBancaire cp, int i) {
		this.debit(i);
		cp.credit(i);
	}

}
