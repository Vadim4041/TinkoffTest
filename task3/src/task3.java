import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "6 2";
        String[] subStr;
        String delimiter = " ";
        subStr = s.split(delimiter);

        int sectors = parseInt(subStr[0]);
        int doors = min(parseInt(subStr[1]), sectors);


        int[] peopleInSectorArray;
        peopleInSectorArray = new int[sectors];

        peopleInSectorArray[0] = 2;
        peopleInSectorArray[1] = 5;
        peopleInSectorArray[2] = 4;
        peopleInSectorArray[3] = 2;
        peopleInSectorArray[4] = 6;
        peopleInSectorArray[5] = 2; // тест, ручной ввод, для отладки

//        for (int i = 0; i < sectors; i++) {
//               peopleInSectorArray[i] = scanner.nextInt();
//        } // ввод с консоли, на бой

        System.out.println(Arrays.toString(peopleInSectorArray));

        int[] peopleTimesSectors;
        peopleTimesSectors = new int[doors * sectors];

        for (int i = 0; i < doors; i++) {
            for (int j = 0; j < sectors; j++) {
//                peopleTimesSectors[]
            }
        }
    }
}
