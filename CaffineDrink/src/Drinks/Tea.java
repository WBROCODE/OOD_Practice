package Drinks;

import Types.CaffineDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffineDrink {
    @Override
    public void brew() {
        System.out.println("Steep the tea");
    }
    @Override
    public void addCondiment() {
        System.out.println("Add lemon");
    }

    @Override
    public boolean customerWantsCondiment() {
        return getInput().equals("y");
    };

    public String getInput() {
        String input = null;

        System.out.println("Would you like to add lemon? (y/n)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            input = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Exception try again");
        }

        if(input == null) {
            return "n";
        }

        return input;

    }
}
