package lienCompte;

public class Main {
	
	public static void main (String[] args) {
		
		CompteBancaire cp = new CompteBancaire ();
		CompteBancaire ct = new CompteBancaire (-40);
		
		System.out.println(cp.getSolde());
		System.out.println(ct.getSolde());
	}

}
