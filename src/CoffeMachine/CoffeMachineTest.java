package CoffeMachine;

import junit.framework.TestCase;

import org.junit.Test;

public class CoffeMachineTest extends TestCase {

	@Test
	public void prepareAllCoffes() {

		String blackCoffe = "Café preto";
		String coffeWithSugar = "Café com açucar";
		String coffeWithCream = "Café com creme";
		String coffeWithCreamAndSugar = "Café com creme e açucar";

		CoffeMachine coffeMachine = new CoffeMachine();
		assertEquals(blackCoffe, coffeMachine.prepareNewCoffe("Café preto"));
		assertEquals(coffeWithSugar, coffeMachine.prepareNewCoffe("Café com açucar"));
		assertEquals(coffeWithCream, coffeMachine.prepareNewCoffe("Café com creme"));
		assertEquals(coffeWithCreamAndSugar, coffeMachine.prepareNewCoffe("Café com creme e açucar"));
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
