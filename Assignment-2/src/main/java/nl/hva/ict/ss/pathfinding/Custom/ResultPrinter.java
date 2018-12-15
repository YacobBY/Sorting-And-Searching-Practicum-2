package nl.hva.ict.ss.pathfinding.Custom;

import java.util.ArrayList;

public class ResultPrinter {

    public ResultPrinter() {

    }

    public  void printStringList(ArrayList<TestResult> resultList) {
        System.out.println("Bitmapnumber: ");
        for (TestResult test : resultList) {
            System.out.println(test.getBitmapName());
        }
        System.out.println("Tiles");
        for (TestResult test : resultList) {
            System.out.println(test.getTiles());
        }
        System.out.println("Length");
        for (TestResult test : resultList) {
            System.out.println(test.getLength());
        }
        System.out.println("getCost");
        for (TestResult test : resultList) {
            System.out.println(test.getCost());
        }
    }
}
