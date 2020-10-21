package com.shamy1st.facade;

public class NotificationService {

	public void send(String message, String target) {
		NotificationServer server = new NotificationServer();
		Connection connection = server.connect("ip");
		AuthenticationToken authenticationToken = server.authenticate("appID", "key");
		server.send(authenticationToken, new Message(message), target);
		connection.disconnect();
	}
}
