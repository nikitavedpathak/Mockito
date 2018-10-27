import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.mokito.api.TodoBusinessImpl;
import com.mokito.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMokitoAnnotation {

	@Mock
	TodoService todoservice;

	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;

	@Test
	public void test() 
	{

		when(todoservice.retrieveTodos("user")).thenReturn(Arrays.asList("Software Testing","Node Coverage","Edge Coverage","Prime Coverage"));

		//Test case to check size of output from method
		assertEquals(3,todoBusinessImpl.retrieveTodosRelatedToTesting("user").size());


		//Test case to check the data of method		
		List<String> expected = Arrays.asList("Node Coverage","Edge Coverage","Prime Coverage");
		assertEquals(expected,todoBusinessImpl.retrieveTodosRelatedToTesting("user"));



	}

}
