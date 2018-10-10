package ASEDemo.CodeCoverage;

import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
	@Test
    public void testApp()
    {
		App obj = new App();
        Assert.assertEquals(2, obj.add(1, 1));
    }
}
