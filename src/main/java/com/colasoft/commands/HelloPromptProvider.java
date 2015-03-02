package com.colasoft.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(value=-1024)
public class HelloPromptProvider extends DefaultPromptProvider {
	
	
	@Override
	public String getPrompt() {
		return "hello-shell>";
	}
	
	@Override
	public String getProviderName() {
		return "HelloProvider";
	}
}