package com.company;

public class Main {

    public static void main(String[] args) {
        Newspaper[] reader = new Newspaper[1];
        reader[0] = new Newspaper("Merve", 2004, 4, 16, false);

        for (Newspaper person : reader)
            System.out.println(person);
    }
}

