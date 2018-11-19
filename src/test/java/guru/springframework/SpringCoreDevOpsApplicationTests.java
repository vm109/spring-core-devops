package guru.springframework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringCoreDevOpsApplication.class)
@WebAppConfiguration
public class SpringCoreDevOpsApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals("one", "two");
	}

}
