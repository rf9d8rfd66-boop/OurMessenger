public class Main {
    public static void main(String[] args) {
        Kanal kanal1 = new Kanal("Azali_xz", 21);
        Group group1 = new Group("Группа 501", 29);
        Users juliya = new Users("Юлия");
        Users taliya = new Users("Талия");
        Users aza = new Users("Азалия");
        Messages message1 = new Messages("Hello", group1, "11:32", juliya);
        Messages.send_messages(message1);
        Messages message2 = new Messages("How are you", group1, "11:33", juliya);
        Messages.send_messages(message2);
        Messages message3 = new Messages("I am fine", group1, "11:56", taliya);
        Messages.send_messages(message3);
        Messages message4 = new Messages("Всем привет, это мой канал", kanal1, "18:01", aza);
        Messages.send_messages(message4);

        Messages.printMessages();





    }

}
