import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0, rightDiagonal = 0;
        for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(j);
        }
        return Math.abs(leftDiagonal - rightDiagonal);
    }

}
