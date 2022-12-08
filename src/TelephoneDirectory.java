import java.util.HashMap;

public class TelephoneDirectory {
    private static HashMap<String, String> phoneNumber;

    public TelephoneDirectory() {
    }

    public static HashMap<String, String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
