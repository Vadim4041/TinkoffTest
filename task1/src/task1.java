import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

public class task1 {

    public static void main(String[] args) {
        String s = "10 3 2 8";
        String[] subStr;
        String delimiter = " ";
        subStr = s.split(delimiter);

        int start = parseInt(subStr[0]);
        int destination = parseInt(subStr[1]);
        int trainStart = parseInt(subStr[2]);
        int trainDestination = parseInt(subStr[3]);
        int temp;

        if (start > destination) {
            temp = start;
            start = destination;
            destination = temp;
        }

        if (trainStart > trainDestination) {
            temp = trainStart;
            trainStart = trainDestination;
            trainDestination = temp;
        }

        int distance = abs(destination - start);
        int distanceWithTrain = abs(trainStart - start) + abs(destination - trainDestination);

        System.out.println(Math.min(distance, distanceWithTrain));
    }
}
