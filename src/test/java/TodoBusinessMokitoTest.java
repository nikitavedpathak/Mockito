import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.mokito.api.TodoBusinessImpl;
import com.mokito.api.TodoService;
import com.mokito.api.TodoServiceStub;


public class TodoBusinessMokitoTest {

	@Test
	public void test() 
	{	
		
		TodoService todoservice = mock(TodoService.class);

		when(todoservice.retrieveTodos("user")).thenReturn(Arrays.asList("Software Testing","Node Coverage","Edge Coverage","Prime Coverage"));
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoservice);
		
		//Test case to check size of output from method
		assertEquals(3,todoBusinessImpl.retrieveTodosRelatedToTesting("user").size());
		
		//Test case to check the data of method		
		List<String> expected = Arrays.asList("Node Coverage","Edge Coverage","Prime Coverage");
		assertEquals(expected,todoBusinessImpl.retrieveTodosRelatedToTesting("user"));



	}

}
