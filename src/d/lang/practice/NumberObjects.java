package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args){
        NumberObjects sample = new NumberObjects();
        sample.parseLong("1024");
        sample.parseLong("r1024");
        sample.printOtherBase(1024);
    }
    public long parseLong(String data){
        long parseData = -1;
        try {
            parseData = Long.parseLong(data);
            System.out.println(parseData);
        }
        catch(NumberFormatException e){
            System.out.println(data + "is not a number.");
            parseData = -1;
        }
        catch(Exception e){

        }

        return parseData;
    }
    public void printOtherBase(long data){
        System.out.println("Original:" + data);
        System.out.println("Binary:" + Long.toBinaryString(data));
        System.out.println("Hex:" + Long.toHexString(data));
        System.out.println("Octal:" + Long.toOctalString(data));
    }
}
