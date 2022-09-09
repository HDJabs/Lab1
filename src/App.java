import java.util.*;
import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);

        int divNum = 0;
        String strQrtSales;
        String[] strQrtSalesArr;
        double[] dou  = new double[4];

        double total = 0;

        

        /*
        for (divNum = 0; divNum<4; divNum++) {
            System.out.println("Please enter the four quarterly sales for DIV " + divNum + " seperated by space:");
            strQrtSales = input.nextLine();
            strQrtSalesSplit = strQrtSales.split(" ");
            
            for(int qrt=0; qrt<4; qrt++) {
                qrtSales[divNum][qrt] = Double.valueOf(strQrtSalesSplit[qrt]);
                //totalSales+=qrtSales[divNum][qrt];
            }
        
        }
        */

        /*
        System.out.println("div                 q1                  q2                  q3                  q4");
        for (int divInd = 0; divInd<4; divInd++){
            System.out.print(divInd + "   ");
            for (int qrtInd=0; qrtInd<4; qrtInd++){
                System.out.printf("%20.2f", qrtSales[divInd][qrtInd]);
            }
            System.out.println();
        }
        */

        System.out.println("Please enter the four quarterly sales for Div 1 seperated by space:");
        strQrtSales = input.nextLine();
        strQrtSalesArr = strQrtSales.split(" ");
        dou[0] = Double.valueOf(strQrtSalesArr[0]);
        dou[1] = Double.valueOf(strQrtSalesArr[1]);
        dou[2] = Double.valueOf(strQrtSalesArr[2]);
        dou[3] = Double.valueOf(strQrtSalesArr[3]);
        DivSales divSales1 = new DivSales(dou[0], dou[1], dou[2], dou[3]);
        total += (dou[0] + dou[1] + dou[2] + dou[3]);

        System.out.println("Please enter the four quarterly sales for Div 2 seperated by space:");
        strQrtSales = input.nextLine();
        strQrtSalesArr = strQrtSales.split(" ");
        dou[0] = Double.valueOf(strQrtSalesArr[0]);
        dou[1] = Double.valueOf(strQrtSalesArr[1]);
        dou[2] = Double.valueOf(strQrtSalesArr[2]);
        dou[3] = Double.valueOf(strQrtSalesArr[3]);
        DivSales divSales2 = new DivSales(dou[0], dou[1], dou[2], dou[3]);
        total += (dou[0] + dou[1] + dou[2] + dou[3]);

        System.out.println("Please enter the four quarterly sales for Div 3 seperated by space:");
        strQrtSales = input.nextLine();
        strQrtSalesArr = strQrtSales.split(" ");
        dou[0] = Double.valueOf(strQrtSalesArr[0]);
        dou[1] = Double.valueOf(strQrtSalesArr[1]);
        dou[2] = Double.valueOf(strQrtSalesArr[2]);
        dou[3] = Double.valueOf(strQrtSalesArr[3]);
        DivSales divSales3 = new DivSales(dou[0], dou[1], dou[2], dou[3]);
        total += (dou[0] + dou[1] + dou[2] + dou[3]);

        System.out.println("Please enter the four quarterly sales for Div 4 seperated by space:");
        strQrtSales = input.nextLine();
        strQrtSalesArr = strQrtSales.split(" ");
        dou[0] = Double.valueOf(strQrtSalesArr[0]);
        dou[1] = Double.valueOf(strQrtSalesArr[1]);
        dou[2] = Double.valueOf(strQrtSalesArr[2]);
        dou[3] = Double.valueOf(strQrtSalesArr[3]);
        DivSales divSales4 = new DivSales(dou[0], dou[1], dou[2], dou[3]);
        total += (dou[0] + dou[1] + dou[2] + dou[3]);
        
        System.out.println("div                 q1                  q2                   q3                  q4");
        System.out.println("0                  " + divSales1.getQrt(0) + "                  " + divSales1.getQrt(1) + "                  " + divSales1.getQrt(2) + "                  " + divSales1.getQrt(3));
        System.out.println("0                  " + divSales2.getQrt(0) + "                  " + divSales2.getQrt(1) + "                  " + divSales2.getQrt(2) + "                  " + divSales2.getQrt(3));
        System.out.println("0                  " + divSales3.getQrt(0) + "                  " + divSales3.getQrt(1) + "                  " + divSales3.getQrt(2) + "                  " + divSales3.getQrt(3));
        System.out.println("0                  " + divSales4.getQrt(0) + "                  " + divSales4.getQrt(1) + "                  " + divSales4.getQrt(2) + "                  " + divSales4.getQrt(3));
        System.out.println("The total sales of the corporate in the year is : " + total);

        input.close();



    }

    public static class DivSales {
        private static double totalSales;
        private double[] quarterlySales = new double[4];

        public DivSales(){
        }

        public DivSales(double d1, double d2, double d3, double d4) {
            this.quarterlySales[0] = d1;
            this.quarterlySales[1] = d2;
            this.quarterlySales[2] = d3;
            this.quarterlySales[3] = d4;

            this.totalSales+=(d1+d2+d3+d4);
        }

        public double getQrt(int index) {
            return this.quarterlySales[index];
        }

        public void printQrt(){
            for(int x=0; x<4; x++) {
                System.out.print(quarterlySales[x] + "          ");
            }
        }
    }
}
