package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;
import java.util.ArrayList;
import java.util.Date;

public class UserData {

    private static ArrayList<User> myUsers = new ArrayList<>();

    //add
    public static void addUser(User user){
        myUsers.add(user);
    }

    public static ArrayList<User> getAll(User user){
        return myUsers;
    }

    public static User getById(int id) {
        for (User user :myUsers) {
            if(user.getId() == id) return user;
        }
        return null;
    }

}
