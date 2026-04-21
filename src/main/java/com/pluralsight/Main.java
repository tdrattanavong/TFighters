package com.pluralsight;

import java.lang.reflect.Array;

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

    }
}
