package d.collection;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args){
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }
    public int getCarKinds(String[] cars){
        if(cars == null) return 0;
        HashSet<String> carSet = new HashSet<>();
        for(String car : cars){
            carSet.add(car);
        }
        printCarSet(carSet);
        return carSet.size();
    }
    public void printCarSet(Set<String> carSet){
        for(String car:carSet){
            System.out.print(car + " ");
        }
    }
}
