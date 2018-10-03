package org.sla;

class AntonioDeRock {
    public static void main(String[] args) {
        // (4.5 * 2.2)^2 / 5 + 3

        double a = 4.5;
        double b = 2.2;
        int c  = 5;
        int d = 3;

        System.out.println(" ");

        double A = Math.pow(4.5 * 2.2, 2);
        System.out.println("First simplify in the parenthesis, (" + a + " * " + b + ")^2 / " + c + " + " + d + "!");
        double temp = a * b;
        System.out.println("Raise " + temp + " to the 2nd power, (" + temp + ")^2 / 5 + 3!");
        System.out.println(A);

        double B = A / 5;
        double tem = c;
        System.out.println("Divide by " + tem + ", (98.01) / " + tem + " + 3!");
        System.out.println(B);


        double C = B + 3;
        double te = d;
        System.out.println("Add " + te + ", 19.602 + " + te + " !");
        System.out.println(C + "!");
    }
}