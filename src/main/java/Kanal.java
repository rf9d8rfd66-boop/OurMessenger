public class Kanal {
    private String name;
    private Messanges lastMessenge;
    private int countSub;

    public Kanal(String name, Messanges lastMessenge, int countSub) {
        this.name = name;
        this.lastMessenge = lastMessenge;
        this.countSub = countSub;
    }

    public String toString() {
        return "Kanal " + name + "\n" + lastMessenge + "\n" + "Subscribers count = " + countSub + "\n" + "Subscribers: " + kanalSub;
    }
}
