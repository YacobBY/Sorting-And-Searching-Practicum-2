package nl.hva.ict.ss.pathfinding.Custom;

import java.util.ArrayList;

public class ResultPrinter {

    public ResultPrinter() {

    }

    public  void printStringList(ArrayList<TestResult> resultList) {
        for (TestResult test : resultList) {
            System.out.println(test.getBitmapName());
        }
        for (TestResult test : resultList) {
            System.out.println(test.getTiles());
        }
        for (TestResult test : resultList) {
            System.out.println(test.getLength());
        }
        for (TestResult test : resultList) {
            System.out.println(test.getCost());
        }
    }
}
