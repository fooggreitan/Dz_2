public class Dz_2 {
    public static void main(String[] args) {
        int[] arr = {1, 25, 10, 30, 12, 0, -1, 100};
        heapSort(arr);
        for (int i = 0; i <  arr.length; i++) System.out.print(arr[i] + " ");
    }
    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0 ; i--) heapify(arr, i, arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0]  = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void heapify(int[] arr, int i, int n) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }
}
