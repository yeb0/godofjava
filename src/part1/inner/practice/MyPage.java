package part1.inner.practice;

import part1.inner.InputBox;
import part1.inner.KeyEventListener;

public class MyPage {
    InputBox input;
    public static void main(String[] args) {
        MyPage test = new MyPage();
        test.setUI();
        test.pressKey();
    }
    public void setUI() {
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("KEY DOWN");
            }

            @Override
            public void onKeyUp() {
                System.out.println("KEY UP");
            }
        };
        input.setKeyListener(listener);
    }
    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
}
