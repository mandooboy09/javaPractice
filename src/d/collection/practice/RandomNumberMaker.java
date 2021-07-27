package d.collection.practice;

import java.util.Random;
import java.util.HashSet;

public class RandomNumberMaker {
    public static void main(String[] args){
        RandomNumberMaker sample = new RandomNumberMaker();

        for(int i = 1; i <= 10; i++){
            HashSet<Integer> sixNumber = sample.getSixNumber();
            System.out.println(sixNumber);
        }
    }
    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> sixNumber = new HashSet<>();

        while(sixNumber.size() < 6){
            Random random = new Random();
            int tempNumber = random.nextInt(45);
            sixNumber.add(tempNumber);
        }
        return sixNumber;
    }
}