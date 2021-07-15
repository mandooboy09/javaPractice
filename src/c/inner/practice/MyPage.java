package c.inner.practice;

public class MyPage {
    InputBox input;

    public void setUI(){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            public void onKeyDown(){
                System.out.println("Key Down");
            }
            public void onKeyUp(){
                System.out.println("Key Up");
            }
        };

        input.setKeyListener(listener);

    }

    public void pressKey(){
        if(input == null) {
            System.out.println("input is null");
            return;
        }

        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
    public static void main(String[] args){
        MyPage practice = new MyPage();
//        practice.setUI();
        practice.pressKey();
    }
}
