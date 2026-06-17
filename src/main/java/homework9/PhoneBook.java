/** @author Giorgi Gogua */
package homework9;

import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, String> phones = new HashMap<>();

    public static String findPhone(String name) {
        if (phones.containsKey(name)) {
            return phones.get(name);
        }
        return "არ მოიძებნა";
    }

    public static void main(String[] args) {
        phones.put("Giorgi", "555-111-222");
        phones.put("Anna", "555-222-333");
        phones.put("Beka", "555-333-444");
        phones.put("Nino", "555-444-555");

        System.out.println(findPhone("Giorgi"));
        System.out.println(findPhone("Dato"));

        for (String name : phones.keySet()) {
            System.out.println(name + " -> " + phones.get(name));
        }
    }
}
