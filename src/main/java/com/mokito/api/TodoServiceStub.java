package com.mokito.api;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService
{

    public List<String> retrieveTodos(String user)
    {

    	return Arrays.asList("Software Tesing", "node Coverage", "Edge Coverage", "Prime Coverage");

    }
}
