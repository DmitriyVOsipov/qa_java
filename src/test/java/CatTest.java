import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
	@Mock

	Feline feline;
	Predator predator;
	Cat cat;

	@Before
	public void setUp() {
		cat = new Cat(feline);
	}

	@Test
	public void getSoundTest() {
		Assert.assertEquals("Мяу", cat.getSound());
	}

	@Test(expected = NullPointerException.class)
	public void getFoodAlwaysNullTest() throws Exception {
		List<String> expectedList = predator.eatMeat();
		List<String> actualList = cat.getFood();
		Assert.assertEquals(expectedList, actualList);
	}

	@Test
	public void getFoodCatIsPredator() throws Exception {

		Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
		assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
	}
}