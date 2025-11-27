public class Messages {
    private String text;
    private String time;
    private Users user;
    private Chat toChat;
    private static Messages[] all_messages = new Messages[100];

    public Messages(String text, Chat toChat, String time, Users user) {
        this.text = text;
        this.toChat = toChat;
        this.time = time;
        this.user =  user;

    }

    public static void send_messages(Messages message) {
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
                System.out.println(all_messages[i].text + " " + all_messages[i].time + " От " + all_messages[i].user.name + " кому: " + all_messages[i].toChat.name);
            }
            else {
                break;
            }
        }
    }

}
