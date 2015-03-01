package com.colasoft.commands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.shell.Bootstrap;
import org.springframework.shell.core.CommandResult;
import org.springframework.shell.core.JLineShellComponent;

public class HelloWorldCommandsTest {

	@Test
	public void testSimple() {
		Bootstrap bootstrap = new Bootstrap();
		
		JLineShellComponent shell = bootstrap.getJLineShellComponent();
		
		CommandResult cr = shell.executeCommand("hw simple --message hello");
		assertEquals(true, cr.isSuccess());
		assertEquals("Message = [hello] Location = [null]", cr.getResult());
	}

}
