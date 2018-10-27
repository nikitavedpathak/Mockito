package com.mokito.api;

import java.util.ArrayList;
import java.util.List;

import com.mokito.api.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) 
	{
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToTesting(String user) {
		
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		
		for (String todo : allTodos) 
		{
			if (todo.contains("Coverage")) 
			{
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}
}
