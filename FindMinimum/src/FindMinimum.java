
public class FindMinimum {
    /**
     * @return the minimum of three numbers
     */
    public static int findMinimum(int a, int b, int c) {
        int minimum = a < b ? a : b;
        minimum = minimum < c ? minimum : c;
        return minimum;
    }
}
