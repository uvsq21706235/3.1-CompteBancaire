package lienCompte;

import static org.junit.Assert.*;

public class Test {

	private CompteBancaire c 
/*	
	@Before
	public void 
	c = new CompteBancaire (100);
*/

	@org.junit.Test
	public void initialisationCompte() {
		assertEquals (100, c.getSolde());
		
	}
	
	@org.junit.Test
	public void initialisationCompteNull() {
		assertEquals (0, c.getSolde());
		
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void initialisationCompteNegatif() {
		CompteBancaire cp = new CompteBancaire (-3);
		
	}
	
	@org.junit.Test
	public void creditCompte() {
		c.credit(100);
		assertEquals (200, c.getSolde());
		
	}
	
	@org.junit.Test (expected = IllegalArgumentException.class)
	public void creditCompteNegatif() {
		c.credit(-100);
		
	}
	
	@org.junit.Test
	public void debitCompte() {
		c.debit(100);
		assertEquals (0, c.getSolde());
		
	}
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void debitDecouvertCompte() {
		c.debit(200);
		
	}
	
	
	@org.junit.Test (expected =IllegalArgumentException.class)
	public void debitCompteNegatif() {
		c.debit(-100);
	}
	
	
	@org.junit.Test
	public void virementCompte() {
		CompteBancaire cp = new CompteBancaire (100);
		c.virement (cp, 100);
		assertEquals (0, c.getSolde());
		assertEquals (200, cp.getSolde());
	}
	
}