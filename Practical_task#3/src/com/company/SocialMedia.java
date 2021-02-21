package com.company;

import java.util.HashMap;
import java.util.Map;

public class SocialMedia {
    private Map<String, String> stringMap;

    public SocialMedia(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Boolean registratorNewUser(String nick, String fullName) {
        if(stringMap.containsKey(nick)) {
            System.out.println("Nickname is not available. Please re-try create the nickname");
            return false;
        } else  {
            stringMap.put(nick, fullName);
            System.out.println("Congratulations, you're registered successfully!");
            return true;
        }
    }

    public Boolean removeUser(String nick) {
        if(stringMap.containsKey(nick)) {
            stringMap.remove(nick);
            System.out.println("Removed successfully!");
            return true;
        } else {
            System.out.println("This user does not exist!");
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.stringMap);
        return stringBuilder.toString();
    }

}
