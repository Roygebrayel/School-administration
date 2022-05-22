package Test1;

import javax.swing.*;

public class TextAreaExample extends Student{
        TextAreaExample() {
                Student st = new Student();
                JFrame f = new JFrame();
                JTextArea area = new JTextArea(stInBus);
                area.setBounds(10, 30, 200, 200);
                f.add(area);
                f.setSize(300, 300);
                f.setLayout(null);
                f.setVisible(true);
        }

        public static void main(String args[]) {
                new TextAreaExample();
        }
}