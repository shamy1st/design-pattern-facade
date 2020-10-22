# Facade Design Pattern (Java Implementation)

**Facade** provide a simple interface to a complex system.
![](https://github.com/shamy1st/design-pattern-facade-java/blob/main/facade-uml.png)
### Problem: 
You want to send push notifications to mobile app users.

The issue is everytime you want to send notification you should do all these steps as in main.

    public class Main {
        public static void main(String[] args) {
            NotificationServer server = new NotificationServer();
            Connection connection = server.connect("ip");
            AuthenticationToken authenticationToken = server.authenticate("appID", "key");
            server.send(authenticationToken, new Message(message), target);
            connection.disconnect();
        }
    }

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

    public class Connection {
        public void disconnect() { }
    }

    public class AuthenticationToken {

    }

    public class Message {
        private String content;

        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-facade-java/blob/main/facade-solution-uml.png)
