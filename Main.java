import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.awt.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        byte age = 30, temp = 40;
        Date now = new Date();
        System.out.println(now);
        System.out.println(age - temp);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        
        System.out.println(Arrays.toString(numbers));

        String result = NumberFormat.getCurrencyInstance().format(1234567.890);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name");
        String name = scanner.nextLine().trim();
        System.out.println("Age = " + name);

    }

}