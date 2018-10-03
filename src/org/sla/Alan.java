package org.sla;

class Alan {
    public static void main(String[] args) {
        // Variables for the Circle Equation
        long a = 20;
        long b = 10;
        double c = 105.5 + Integer.sum(2,3);
        double d = 3.14159265359;

        Long Radius = a;
        Long RadiusII = b;
        Double RadiusIII = c;
        Double Pi = d;


        // Message
        System.out.println("\n");
        System.out.println("There are three circles across a straight line: circle A, circle B, and circle C.");
        System.out.println("Task: compare the area of circle C to the combined areas of circles A and B.");
        System.out.println("Here is the circle equation: A = πr^2");
        System.out.println("Here is the equation to solve the problem: area of circle C - (area of circle A + area of circle B)");

        System.out.println("\n");
        System.out.println("π = " + d);
        System.out.println("Pi is " + Pi.toString());
        System.out.println("Originated from " + Pi.getClass());

        System.out.println("\n");
        System.out.println("a = " + a);
        System.out.println("Radius of circle A: " + Radius.toString() + " meters.");
        System.out.println("Originated from " + Radius.getClass());

        System.out.println("\n");
        System.out.println("b = " + b);
        System.out.println("Radius of circle B: " + RadiusII.toString() + " meters.");
        System.out.println("Originated from " + RadiusII.getClass());

        System.out.println("\n");
        System.out.println("c = " + c);
        System.out.println("Radius of circle C: " + RadiusIII.toString() + " meters.");
        System.out.println("Originated from " + RadiusIII.getClass());

        System.out.println("\n");
        double Area = Pi*Math.pow(a,2);
        System.out.println("The area of circle A is " + Area);

        System.out.println("\n");
        double AreaII = Pi*Math.pow(b,2);
        System.out.println("The area of circle B is " + AreaII);

        double AreaIII = Pi*Math.pow(c,2);
        System.out.println("The area of circle C is " + AreaIII);

        System.out.println("\n");
        System.out.println("Let's figure out the answer.");
        System.out.println("c - (a + b)");
        System.out.println(AreaIII + " - " + "(" + Area + " + "+ AreaII + ")");
        System.out.println(AreaIII + " - " + (Area + AreaII));
        System.out.println(AreaIII - Area + AreaII + " is the answer to the task");
        System.out.println("\n");

        System.out.println("Let's do some comparisons to circles A, B, and C");
        boolean comparisionAB = Area < AreaII;
        if (comparisionAB) {
            System.out.println("The area of the circle A is less than the area of circle B");
        } else {
            System.out.println("The area of the circle A is greater than the area of circle B");
        }
        boolean comparisionBC = AreaII < AreaIII;
        if (comparisionBC) {
            System.out.println("The area of the circle B is less than the area of circle C");
        } else {
            System.out.println("The area of the circle B is greater than the area of circle C");
        }
        boolean comparisionAC = Area < AreaIII;
        if (comparisionAC) {
            System.out.println("The area of the circle A is less than the area of circle C");
        } else {
            System.out.println("The area of the circle A is greater than the area of circle C");
        }
    }
}
