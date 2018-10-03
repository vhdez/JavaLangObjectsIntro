package org.sla;

public class ChloeMath {
    public static void main(String[] args) {
        // 12x - 12 = 72
        long a = 12;
        long b = 72;
        long c = 12;


        //Solve for x
        System.out.println(a + "x - " + c + " = " + b);

        long newValue = Math.addExact(b, c);
        System.out.println(a + "x = " + newValue);

        long x = newValue/a;
        System.out.println("x = " + x);
    }
}
