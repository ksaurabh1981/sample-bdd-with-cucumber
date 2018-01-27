package sample.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

import java.util.Arrays;

import org.junit.Assert;

public class CalculatorSteps implements En{
	private int input1;
	private int input2;
	private int result;
	
	public void steps1() {
		Given("^first input (\\d+)$", (Integer arg1) -> {
		    input1=arg1;
		});

		Given("^second input (\\d+)$", (Integer arg1) -> {
			input2=arg1;
		});

		When("^call add two number$", () -> {
		    result = new Calculator().add(input1,input2);
		});

		Then("^return result is (\\d+)$", (Integer res) -> {
		    
		    Assert.assertArrayEquals(new Integer[] {result}, new Integer[] {res});
		});

	}
}
