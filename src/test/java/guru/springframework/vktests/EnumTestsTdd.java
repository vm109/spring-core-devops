package guru.springframework.vktests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import guru.springframework.SpringCoreDevOpsApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringCoreDevOpsApplication.class)
@WebAppConfiguration
public class EnumTestsTdd {

	@Test
	public void testEnumSetter() {
			EnumTests.friday.setDayInWeek(5);
			assertEquals(5, EnumTests.friday.getDayInWeek());
	}
}
