import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[][] A = {
                    {1, 0, 12, -1},
                    {7, -2, 2, 1},
                    {-5, -2, 2, -9}
        };
        int[] B = {1, 3, 5};
        System.out.println(ArrayOps.sum(B));
        System.out.println(ArrayOps.largest(B));
        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(ArrayOps.sum(A));

        int[] empty = {};
        int[][] empty2D = {};
        int[][] emptyRows2D = {{}, {}, {}};
        System.out.println(ArrayOps.sum(empty));
        System.out.println(ArrayOps.sum(empty2D));
        System.out.println(ArrayOps.sum(emptyRows2D));

        System.out.println(Arrays.toString(ArrayOps.sumRows(empty2D)));
        System.out.println(Arrays.toString(ArrayOps.sumRows(emptyRows2D)));

        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));

        int[][] rowNotCol = { {  1,  2, 3, 4 },
                        {  2, 3,  4,  1 },
                        { 3, 4,  1, 2 } }; 
        int[][] colNotRow = { {  1,  1, 1 },
                            {  2, 2, 2 },
                            { 3,  3, 3 } };  
        System.out.println(ArrayOps.isRowMagic(rowNotCol));
        System.out.println(ArrayOps.isColMagic(colNotRow));

        int[][]E = { 
            {  2,  4, 2 }, 
            {  2, 2, 2 } }; 
        System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
        System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
    }
}
