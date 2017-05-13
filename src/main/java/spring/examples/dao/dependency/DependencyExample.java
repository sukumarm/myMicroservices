package spring.examples.dao.dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/TestContext.xml"})
public class DependencyExample 
{
	@Autowired
	MyFirstService firstService;

	@Test
	public void testMyFirstService(){
		firstService.getFirstValue();
	}
}

@Component
class MyFirstService {

	public void getFirstValue() {
		System.out.println("Am your first service");
	}
	
}