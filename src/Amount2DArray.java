import java.util.Arrays;

public class Amount2DArray {

    /*
        Schreiben Sie eine Methode, die alle Elemente im übergebene 2D-Array in einen Betrag umrechnet.
        Enthält das Array also negative Werte sollen diese in den gleich weit von 0 entfernten positiven
        Wert überführt werden.
     */
    public static int[][] turnAllElementsOf2DArrayToAmound(int[][] values) {
        // Leere 2D-Arrays werden unverändert zurückgetgeben.
        if(values == null || values.length == 0 || values[0].length == 0) {
            System.out.println("Array empty");
            return values;
        }

        /*
            Das 2D-Array wird mit einer doppelten for-Schleife komplett durchlaufen
            Die obere Schleife durchläuft alle "Reihen"
            Die untere Schleife durchläuft alle "Spalten"
         */
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                // Wird ein negativer Wert gefunden, so wird dieser durch Multiplikation mit -1 in einen positiven umgewandelt.
                if(values[i][j] < 0) {
                    values[i][j] *=-1;
                }
            }
        }

        return values;
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
