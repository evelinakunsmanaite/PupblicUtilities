package com.entity;

public class UsersList {
    private static User[] users = new User[3];
    
    static {
        users[0] = new User("Lina", "Лина", "1");
        users[1] = new User("Andrew","Андрей", "2");
        users[2] = new User("Dima" ,"Дима", "3");
    }

    public static User[] getUsers() {
        return users;
    }        
}
