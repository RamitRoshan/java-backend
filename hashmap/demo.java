package hashmap;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap<String, String> person  = new HashMap<>();

        //add key value pair
        person.put("name", "pawan");
        person.put("city", "bangalore");
        person.put("email", "pawan@gmail.com");

        System.out.println(person.get("name"));
        person.remove("email");

        System.out.println(person);

        for(String key: person.keySet()){
            System.out.println(key+ "" + person.get(key));
        }
    }
}
