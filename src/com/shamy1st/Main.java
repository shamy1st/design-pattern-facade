package com.shamy1st;

import com.shamy1st.facade.NotificationService;

public class Main {

	public static void main(String[] args) {
		
		NotificationService service = new NotificationService();
		service.send("Hello Facade!", "targetIP");
	}
}
