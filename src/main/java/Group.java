public class Group extends Chat{
    private int countUsers;
    private String name;

    public Group(String name, int countUsers) {
        this.name = name;
        this.countUsers = countUsers;
    }
}
