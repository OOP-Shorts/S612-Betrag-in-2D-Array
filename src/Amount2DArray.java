import java.util.Arrays;

public class Amount2DArray {

    /*
        Schreiben Sie eine Methode, die alle Elemente im übergebene 2D-Array in einen Betrag umrechnet.
        Enthält das Array also negative Werte sollen diese in den gleich weit von 0 entfernten positiven
        Wert überführt werden.
     */
    public static int[][] turnAllElementsOf2DArrayToAmound(int[][] values) {
        return null;
    }

    public static void main(String[] args) {
        int[][] toConvert = {{-1, 1, -1}, {2, -2, 2}, {-3, -3, 3}};
        int[][] converted = turnAllElementsOf2DArrayToAmound(toConvert);

        int[][] test = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        if(Arrays.deepEquals(converted, test)) {
            System.out.println("Correct");
        } else {
            System.out.println("Not all numbers turned to Amount.");
        }
    }
}
