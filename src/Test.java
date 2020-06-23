import java.io.FileInputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(name);

        int count = 0;
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(data > count){
                count = data;
            }
        }
        fileInputStream.close();

        System.out.println(count);
    }
}