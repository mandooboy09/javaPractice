package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    private final int MAX_LOOP = 5000;
    private Hashtable<Integer, Integer> hashtable;
    public static void main(String[] args){
        RandomNumberStatistics sample = new RandomNumberStatistics();
        // 숫자별 빈도수 통계 출력
        sample.getRandomNumberStatistics();
    }
    RandomNumberStatistics(){
        hashtable = new Hashtable<>();
    }

    public void getRandomNumberStatistics(){
        for(int loop = 1; loop <= MAX_LOOP; loop++){
            Random random = new Random();
            int number = random.nextInt(DATA_BOUNDARY);
            putCurrentNumber(number);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber){
        if(! hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber, 1);
        }
        else{
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }
    }
    public void printStatistics(){
        Set<Integer> keySet = hashtable.keySet();
        for(Integer tempKey : keySet){
            System.out.print(tempKey + "=" + hashtable.get(tempKey) + "\t");
            if(tempKey % 10 == 1){
                System.out.println();
            }
        }
    }
}
