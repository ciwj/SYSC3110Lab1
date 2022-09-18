import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyInfos;

    public boolean addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
        return true;
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddyInfos);
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
