package examples2;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 12, 1, 7 };
        //int[] array = { 12, 8, 7, 5, 2, 1 };
        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int[] arr, int startPos, int lastPos) {
        int pivot = arr[(startPos + lastPos) / 2];
        //System.out.println(pivot);
        //System.out.println(startPos + "   " + lastPos + "   " + pivot);
//        for (int i = startPos; i <= lastPos; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //System.out.println();
        int left = startPos;
        int right = lastPos;
        int tmp;
        do {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
//                System.out.println(startPos + "   " + lastPos + "   " + pivot);
//                for (int i = startPos; i <= lastPos; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
                right--;
                left++;
                ///System.out.println(left + "  " + right);
            }

        } while (left <= right);


//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (int i = startPos; i <= right; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int i = left; i <= lastPos; i++) {
//            System.out.print(arr[i] + " ");
//        }

        if (right > startPos)
            quickSort(arr, startPos, right);
        if (left < lastPos)
            quickSort(arr, left, lastPos);
    }
}

