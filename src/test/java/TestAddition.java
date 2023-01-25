
import com.service.AdditionService;
import addition.Addition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class TestAddition {
	@Test
	public void testAddition()
	{
		AdditionService service = mock(AdditionService.class);
		Addition obj = new Addition(service);
		when(service.addition(100,200)).thenReturn(300);
		assertEquals(300,obj.addition(100,200));
		
	}

}
