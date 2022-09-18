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
        BuddyInfo buddy1 = new BuddyInfo("Buddy1", "3 Address Ave.", "123-456-7890");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1);
    }
}
