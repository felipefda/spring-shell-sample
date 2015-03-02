package com.colasoft.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.stereotype.Component;

/**
 * Ascii Art generated via: http://patorjk.com/software/taag/#p=testall&f=3D-ASCII&t=Hello%20World
 * @author einternicola
 *
 */

@Component
@Order(value=-1024)
public class HelloBannerProvider implements BannerProvider {

	public String getProviderName() {
		return "HelloProvider";
	}

	public String getBanner() {
		return "    __  __     ____         _       __           __    __   _____ __         ____\n" + 
				"   / / / /__  / / /___     | |     / /___  _____/ /___/ /  / ___// /_  ___  / / /\n" + 
				"  / /_/ / _ \\/ / / __ \\    | | /| / / __ \\/ ___/ / __  /   \\__ \\/ __ \\/ _ \\/ / / \n" + 
				" / __  /  __/ / / /_/ /    | |/ |/ / /_/ / /  / / /_/ /   ___/ / / / /  __/ / /  \n" + 
				"/_/ /_/\\___/_/_/\\____/     |__/|__/\\____/_/  /_/\\__,_/   /____/_/ /_/\\___/_/_/   \n" + 
				"                                                                                 \n" + 
				"";
	}

	public String getVersion() {
		return "0.0.1";
	}

	public String getWelcomeMessage() {
		return "Welcome to the Hello World Shell";
	}

}
