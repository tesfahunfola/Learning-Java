package com.pluralsight;

public class OperatorsAndVariables {
    public static void main(String[] args) {
        //Puzzles (guess the output)
// 1) Coin Pouch
        int a = 4, b = 6;
        System.out.println(a++ + ++b); // ??
// 2) Combo Attack
        int x = 5, y = 3, z = 2;
        System.out.println(x++ + ++y * z++); // ??
// 3) Loot Bags
        int eggs = 150, perBox = 12;
        System.out.println(eggs / perBox + " " + eggs % perBox); // ??
// 4) Mana Surge
        int n = 10;
        n += n++ + ++n;
        System.out.println(n); // ??
// 5) Triple Buff
        int p = 7;
        System.out.println(p++ + p++ + ++p); // ??
// 6) Bow Shot
        int u = 2, v = 5;
        System.out.println(++u * v-- - u++); // ??
// 7) Average Loot (gotcha: integer division stored in double)
        int gold = 10, players = 3;
        double avg = gold / players;
        System.out.println(avg); // ??
// 8) Arena Math
        int m = 5, d = 3;
        System.out.println(m / d * d + m % d); // ??
// 9) Level Trick
        int lvl = 1;
        lvl = lvl++ + ++lvl + lvl;
        System.out.println(lvl); // ??
// 10) Final Boss Formula
        int A = 5, B = 3, C = 2;
        System.out.println(A++ * --B + C++ / B); // ??

    }
}
