package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    static void main() {

// User picks a fighting class

        int[]columns = {6};

        String sku;
        String name ;
        double price ;
        String department;




//      MuayThai|HardHitting|Slow|Tank
//       Karate|Technical|Fast|fragile
//       Taekwondo|Precision|Fast|Sustainable

    FightingClass nak_muay = new FightingClass("Muay Thai",  "Hard-Hitting","Slow", "Tanky");
    FightingClass dang_soo_do = new FightingClass("Taekwondo",  "Precision","Fast", "Sustainable");
    FightingClass karate_do = new FightingClass("Karate",  "Technical","Steady", "Solid");
    FightingClass grappler = new FightingClass("Wrestling",  "Aggressive","Explosive", "Tough");
    FightingClass boxer = new FightingClass("Boxing",  "Calculated","Fast", "Sturdy");
    FightingClass mix_martial_arts = new FightingClass("MMA",  "Well-Rounded","Controlled", "Solid");
    FightingClass kodokan = new FightingClass("Judo",  "Tactical","Draggy", "Durable");
    FightingClass ving_tsun = new FightingClass("Wing Chun",  "Deflection","Agile", "Fragile");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose Your Fighting Class");
    System.out.println("1. Muay Thai");
    System.out.println("2. Taekwondo");
    System.out.println("3. Karate");
    System.out.println("4. Wrestling");
    System.out.println("5. Boxing");
    System.out.println("6. MMA");
    System.out.println("7. Judo");
    System.out.println("8. Wing Chun");






    }
}
