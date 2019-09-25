package lienCompte;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void initialisationCompte() {
		CompteBancaire c = new CompteBancaire (100);
		assertEquals (100, c.getSolde());
		
	}
	
	@org.junit.Test
	public void initialisationCompteNull() {
		CompteBancaire c = new CompteBancaire (0);
		assertEquals (0, c.getSolde());
		
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void initialisationCompteNegatif() {
		CompteBancaire c = new CompteBancaire (-3);
		
	}
	
	@org.junit.Test
	public void creditCompte() {
		CompteBancaire c = new CompteBancaire (100);
		c.credit(100);
		assertEquals (200, c.getSolde());
		
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void creditCompteNegatif() {
		CompteBancaire c = new CompteBancaire (100);
		c.credit(-100);
		
	}
	
	@org.junit.Test
	public void debitCompte() {
		CompteBancaire c = new CompteBancaire (100);
		c.debit(100);
		assertEquals (0, c.getSolde());
		
	}
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void debitDecouvertCompte() {
		CompteBancaire c = new CompteBancaire (100);
		c.debit(200);
		
	}
	
	
	@org.junit.Test (expected =IllegalArgumentException.class)
	public void debitCompteNegatif() {
		CompteBancaire c = new CompteBancaire (100);
		c.debit(-100);
	}
	
	
	@org.junit.Test
	public void virementCompte() {
		CompteBancaire c = new CompteBancaire (100);
		CompteBancaire cp = new CompteBancaire (100);
		c.virement (cp, 100);
		assertEquals (0, c.getSolde());
		assertEquals (200, cp.getSolde());
	}
	
}