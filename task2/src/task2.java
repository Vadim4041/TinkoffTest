import static java.lang.Integer.parseInt;
import static java.lang.Math.*;

public class task2 {

    public static void main(String[] args) {
        String sStart = "6 10";
        String[] subStrStart;
        String delimiter = " ";
        subStrStart = sStart.split(delimiter);
        String sEnd = "8 4";
        String[] subStrEnd;
        subStrEnd = sEnd.split(delimiter);

        int sum = 0;

        double start1 = parseInt(subStrStart[0]);
        double start2 = parseInt(subStrStart[1]);

        double end1 = parseInt(subStrEnd[0]);
        double end2 = parseInt(subStrEnd[1]);

        if (max(end2, end1) > max(start1, start2)) {
            System.out.println(-1);
            System.exit(0);
        }

        double minStart = min(start1, start2);
        double minEnd = min(end1, end2);


        while (minStart > minEnd) {
            minStart /= 2;
            sum ++;
        }

        double maxStart = max(start1, start2);
        double maxEnd = max(end1, end2);

        while (maxStart > maxEnd) {
            maxStart /= 2;
            sum ++;
        }

        System.out.println(sum);

    }
}
