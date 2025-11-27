public class Messages {
    private String text;
    private String time;
    private Users user;
    private Chat toChat;
    private Messages[] all_messages = new Messages[100];

    public Messages(String text, Chat toChat, String time, Users user) {
        this.text = text;
        this.toChat = toChat;
        this.time = time;
        this.user =  user;
        send_messages(text, toChat, time, user);
    }

    public void send_messages(String text, Chat toChat, String time, Users user) {
        Messages message = new Messages(text, toChat, time, user);
        for (int i = 0; i <= 100; i++) {
            if (all_messages[i] == null) {
                all_messages[i] = message;
                break;
            }
        }
    }
    public static void printMessages() {
        for (int i = 0; i <= 100; i++) {
            if (all_messages[i] != null) {
                System.out.println(all_messages[i]);
            }
            else {
                break;
            }
        }
    }

}