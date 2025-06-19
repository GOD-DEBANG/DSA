class Solution {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Ascending part
                start = mid + 1;
            } else {
                // Descending part
                end = mid;
            }
        }

        // start == end == peak index
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex);
    }
}