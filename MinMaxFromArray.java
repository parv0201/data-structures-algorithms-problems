public class MinMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        MinMax minmax = getMinMax(arr, 0, arr.length - 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }

    private static MinMax getMinMax(int[] arr, int low, int high) {
        MinMax finalMinMax = new MinMax();
        MinMax leftSide = new MinMax();
        MinMax rightSide = new MinMax();

        if (low == high) {
            finalMinMax.max = arr[low];
            finalMinMax.min = arr[low];
            return finalMinMax;
        }

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                finalMinMax.max =arr[low];
                finalMinMax.min = arr[high];
            } else {
                finalMinMax.max =arr[high];
                finalMinMax.min = arr[low];
            }
        }

        int mid = (low + high) / 2;
        leftSide = getMinMax(arr, low, mid);
        rightSide = getMinMax(arr, mid+1, high);

        finalMinMax.min = Math.min(leftSide.min, rightSide.min);
        finalMinMax.max = Math.max(leftSide.max, rightSide.max);
        return finalMinMax;
    }

    static class MinMax {
        int min;
        int max;
    }
}
