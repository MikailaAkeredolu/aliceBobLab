package io.akeredolumikaila;

import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 4/28/16.
 */
public class AliceBob {

    public static void main(String [ ] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("what's your name?");

        String personName = scan.nextLine().toUpperCase();

        if(personName.equals("ALICE") || personName.equals("BOB") ){


            System.out.println("Hello " + personName);

        }else{
            System.out.println("You are not Alice or Bob therefore you cannot enter the Shaolin Temple");
        }
    }

}
