package com.shamy1st.facade;

public class NotificationServer {
	//connect -> Connection
	//authenticate(appID, key) -> AuthToken
	//send(authToken, message, target)
	//conncetion.disconnect()
	
	public Connection connect(String ipAddress) {
		return new Connection();
	}
	
	public AuthenticationToken authenticate(String appID, String key) {
		return new AuthenticationToken();
	}
	
	public void send(AuthenticationToken authenticationToken, Message message, String targetDevice) {
		System.out.println("Sending a message: " + message.getContent() + ", to: " + targetDevice);
	}
}
