public class Group{
    private String name;
    private Messanges lastMessenge;
    private int countUsers;


    public Group(String name, Messanges lastMessenge, int countUsers) {
        this.name = name;
        this.lastMessenge = lastMessenge;
        this.countUsers = countUsers;
    }

    public String toString() {
        return "Group " + name + "\n" + lastMessenge + "\n" + "User counts = " + countUsers;
    }
}
