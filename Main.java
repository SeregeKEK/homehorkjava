package homeworkjava;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        final RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true){
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                    tree.printRBTree();
                }
                catch (Exception ignored){

                }
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}