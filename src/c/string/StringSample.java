package c.string;

public class StringSample {
    public static void main(String[] args){
        StringSample sample = new StringSample();
        sample.convertEUCKR("굴다리");
        sample.convert("굴다리");
        sample.convertUTF16("굴다리");
    }

    public void convertEUCKR(String korean){
        try{
            byte[] array1 = korean.getBytes("EUC-KR");
            printByteArray(array1);
            String korean2 = new String(array1, "EUC-KR");
            System.out.println(korean2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }    
    
    public void convert(String korean){
        try{
            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void convertUTF16(String korean){
        try{

            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array){
        for(byte data:array){
            System.out.print(data + " ");
        }
        System.out.println();
    }


}
