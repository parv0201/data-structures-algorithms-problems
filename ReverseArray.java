public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] resultArray = reverseArray(array, 0, array.length - 1);
        for (int i : resultArray) {
            System.out.println(i);
        }
    }

    private static int[] reverseArray(int[] array, int frontPointer, int backPointer) {
        if (frontPointer >= backPointer) {
            return array;
        }
        int temp = array[frontPointer];
        array[frontPointer] = array[backPointer];
        array[backPointer] = temp;
        frontPointer++;
        backPointer--;
        return reverseArray(array, frontPointer, backPointer);
    }
}
