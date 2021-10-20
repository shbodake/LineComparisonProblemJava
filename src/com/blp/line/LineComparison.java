package com.blp.line;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        int x1,x2,y1,y2;
        double len;
        x1=1;y1=1;x2=4;y2=4;
        len=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length:"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+len);
        if(x1==y1 && x2==y2)
        {
            System.out.println("Two Lines are equal");
        }
        else
        {
            System.out.println("Two Lines are unequal");
        }
        /*
        int compareLength = x1.comapareTo(y1);
        if (compareLength > 0) {
            System.out.println("Length of Line1 is greater than Line2");
        } else if (compareLength < 0) {
            System.out.println("Length of Line1 is less than Line2");
        } else {
            System.out.println("Both of lines are equal");
        }
        */
        Integer x1 = new Integer(1);
        Integer x2 = new Integer(4);
        Integer y1 = new Integer(1);
        Integer y2 = new Integer(4);

        System.out.println(x1.compareTo(y1));// Both are equal
        System.out.println(x1.compareTo(x2)); //x1 is less than x2
        System.out.println(x2.compareTo(y1)); // x2 is greater than y1
    }

}