package d.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {

    ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args){
        ManageHeight sample = new ManageHeight();
        sample.setData();
//        sample.printHeight();
        for(int i = 1; i <= 5; i++){
            sample.printAverage(i);
        }
    }
    public void setData(){
        gradeHeights = new ArrayList<>();

        ArrayList<Integer> grade1 = new ArrayList<>();
        grade1.add(170);
        grade1.add(180);
        grade1.add(173);
        grade1.add(175);
        grade1.add(177);

        ArrayList<Integer> grade2 = new ArrayList<>();
        grade2.add(160);
        grade2.add(165);
        grade2.add(167);
        grade2.add(186);

        ArrayList<Integer> grade3 = new ArrayList<>();
        grade3.add(158);
        grade3.add(177);
        grade3.add(187);
        grade3.add(176);

        ArrayList<Integer> grade4 = new ArrayList<>();
        grade4.add(173);
        grade4.add(182);
        grade4.add(181);

        ArrayList<Integer> grade5 = new ArrayList<>();
        grade5.add(170);
        grade5.add(180);
        grade5.add(165);
        grade5.add(177);
        grade5.add(172);

        gradeHeights.add(grade1);
        gradeHeights.add(grade2);
        gradeHeights.add(grade3);
        gradeHeights.add(grade4);
        gradeHeights.add(grade5);
    }

    public void printHeight(){
        for(int i = 0; i < gradeHeights.size(); i++){
            System.out.printf("Class No.:%d\n", i+1);
            ArrayList<Integer> heights = gradeHeights.get(i);
            for(Integer height : heights){
                System.out.println(height);
            }
        }
    }
    public void printAverage(int classNo){
        int sumHeight = 0;
        double averageHeight = 0;
        ArrayList<Integer> heights = gradeHeights.get(classNo - 1);

        for(int i = 0; i < heights.size(); i++){
            sumHeight += heights.get(i);
        }

        averageHeight = sumHeight / heights.size();
        System.out.printf("Class No.:%.1f\n",averageHeight);
    }
}
