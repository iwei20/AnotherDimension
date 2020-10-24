public class ArrayOps {
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static int largest(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] sumRows(int[][] matrix) {
        int[] result = new int[matrix.length];
        for(int i = 0; i < result.length; ++i) {
            result[i] = sum(matrix[i]);
        }
        return result;
    }

    public static int[] largestInRows(int[][] matrix) {
        int[] result = new int[matrix.length];
        for(int i = 0; i < result.length; ++i) {
            result[i] = largest(matrix[i]);
        }
        return result;
    }

    public static int sum(int[][] arr) {
        return sum(sumRows(arr));
    }

    public static int[] sumCols(int[][] matrix) {
        int[] result = new int[matrix[0].length];
        for(int i = 0; i < result.length; ++i) {
            int sum = 0;
            for(int j = 0; j < matrix.length; ++j) {
                sum += matrix[j][i];
            }
            result[i] = sum;
        }
        return result;
    }

}
