package d.string.practice;

import java.util.Locale;

public class UseStringMethods {
    public static void main(String[] args){
        String example = "The String class represents character strings.";
        String findStr = "string";
        char findChar = 's';
        UseStringMethods sample = new UseStringMethods();

        sample.printWords(example);
        sample.findString(example, findStr);
        sample.findAnyCaseString(example, findStr);
        sample.countChar(example, findChar);

        String findString = "ss";
        sample.printContainWords(example, findString);
    }

    public void printWords(String str){
        String[] strArray = str.split(" ");
        for(String string : strArray){
            System.out.println(string);
        }
    }

    public void findString(String str, String findStr){

        System.out.println("String is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr){
        System.out.println("String is appeared at " + str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str, char findChar){
        int count = 0;
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(findChar == c){
                count += 1;
            }
        }
        System.out.println("char '"+ findChar + "' count is " + count);
    }

    public void printContainWords(String str, String findStr){
        String[] stringArray = str.split(" ");
        for(String string : stringArray){
            if(string.contains(findStr)){
                System.out.println(string);
            }
        }
    }
}
