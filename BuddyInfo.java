public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(){
        this.name = "Default Name";
        this.address = "3390 Mackenzie Bldg";
        this.phoneNumber = "(613)-520-3616";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer", "3342 Mackenzie Bldg", "613-123-4567");

        System.out.println(String.format("Hello %s", buddy.getName()));
    }
}
