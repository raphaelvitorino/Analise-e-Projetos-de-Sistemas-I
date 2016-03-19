package CoffeMachine;

import junit.framework.TestCase;

import org.junit.Test;

public class CoffeMachineTest extends TestCase {

	@Test
	public void prepareAllCoffes() {

		String blackCoffe = "Caf� preto";
		String coffeWithSugar = "Caf� com a�ucar";
		String coffeWithCream = "Caf� com creme";
		String coffeWithCreamAndSugar = "Caf� com creme e a�ucar";

		CoffeMachine coffeMachine = new CoffeMachine();
		assertEquals(blackCoffe, coffeMachine.prepareNewCoffe("Caf� preto"));
		assertEquals(coffeWithSugar, coffeMachine.prepareNewCoffe("Caf� com a�ucar"));
		assertEquals(coffeWithCream, coffeMachine.prepareNewCoffe("Caf� com creme"));
		assertEquals(coffeWithCreamAndSugar, coffeMachine.prepareNewCoffe("Caf� com creme e a�ucar"));
	}

	@Test
	public void paymentWithTheSameValue() {
		Payment pay = new Payment();
		assertEquals(0.35, pay.coffePayment(pay, 0.35));
	}

	@Test
	public void paymentWithMoreValue() {
		Payment pay = new Payment();
		assertEquals(1.00, pay.coffePayment(pay, 1.00));

	}
	
	@Test
	public void insuficientMoney(){
		Payment pay = new Payment();		
		assertEquals(0, pay.coffePayment(pay, 0));
	}


}
