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
    }

}