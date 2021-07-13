package c.exception;

public class CustomException {
    public static void main(String[] args){
        CustomException sample = new CustomException();
        try{
            sample.throwMyException(13);
        }
        catch(MyException mye){
            mye.printStackTrace();
            System.out.println("main - catch");
        }
    }

    public void throwMyException(int number) throws MyException{
        if (number > 12) {
            throw new MyException("Number is over than 12");
        }
//        try {
//            if (number > 12) {
//                throw new MyException("Number is over than 12");
//            }
//        }
//        catch(MyException e){
//            e.printStackTrace();
//            System.out.println("throwMyException - catch");
//        }
    }

}
