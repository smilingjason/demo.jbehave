package story;
import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import demojason.HelloBiz;
public class HelloWorldSteps{
	
	HelloBiz biz;
	
	@Given("a Hello Biz object")	
	public void givenAHelloBizObject(){
		biz = new HelloBiz();
	}
	@When("set the name to $name")
	
	public void whenSaysHiToIt(String name){
		biz.setName(name);
	}
	@Then("it returns $result")
	
	public void thenItReturnsHelloWorld(String result){
		Assert.assertEquals(result, biz.hello());
	}
}