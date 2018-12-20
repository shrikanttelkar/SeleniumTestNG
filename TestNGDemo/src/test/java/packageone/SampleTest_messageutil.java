package packageone;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pack2.MessageUtil;//important

public class SampleTest_messageutil {
	String message = "Hello World";
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      Assert.assertEquals(message, messageUtil.printMessage());
	   }
}
