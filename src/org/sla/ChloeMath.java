package org.sla;

public class ChloeMath {
    public static void main(String[] args) {
        // 12x - 12 = 72
        long x = 12;
        long y = 72;
        long z = 12;


        //Solve for x
        System.out.println(x + "x - " + z + " = " + y);

        long newValue = Math.addExact(y, z);
        System.out.println(x + "x = " + newValue);

        long e = newValue/x;
        System.out.println("x = " + e);
    }
}
