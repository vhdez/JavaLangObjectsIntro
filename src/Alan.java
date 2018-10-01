package org.sla;

class Alan {
    public static void main(String[] args) {
        long longNumber = 18;
        double doubleNumber = -12.76;
        Long longNum = new Long(longNumber);
        Double doubleNum = new Double(doubleNumber);

        System.out.println(longNumber);
        System.out.println(longNum);
        System.out.println(longNum.toString());
        System.out.println(longNum.getClass());

        System.out.println(doubleNumber);
        System.out.println(doubleNum);
        System.out.println(doubleNum.toString());
        System.out.println(doubleNum.getClass());
        String doubleString = String.valueOf(doubleNumber);
        System.out.println(doubleString);

        boolean comparison1 = longNum < doubleNum;
        if (comparison1) {
            System.out.println(longNum + " is less than " + doubleNum);
        } else {
            System.out.println(longNum + " is NOT less than " + doubleNum);
        }

        Boolean comparison2 = new Boolean(comparison1);
        if (comparison2.compareTo(Boolean.FALSE) == 1) {
            System.out.println(longNum + " Boolean.FALSE " + doubleNum);
        } else {
            System.out.println(longNum + " NOT Boolean.FALSE " + doubleNum);
        }
        Long diff1 = longNum - doubleNum.longValue();
        Double diff2 = longNum.doubleValue() - doubleNum;
        System.out.println("longNum - (Long)doubleNum is " + diff1);
        System.out.println("(Double)longNum - doubleNum is " + diff2);

        double sinValue1 = Math.sin(doubleNum.floatValue());
        float sinValue2 = (float)Math.sin(doubleNum.floatValue());
        System.out.println("sin() use 1 calculated" + sinValue1);
        System.out.println("sin() use 2 calculated" + sinValue2);

        System.out.println("Addition 1 " + (double)(longNumber + doubleNumber));
        System.out.println("Addition 2 " + (long)(longNumber + doubleNumber));
        System.out.println("Addition 3 " + longNumber + doubleNumber);
    }
}
