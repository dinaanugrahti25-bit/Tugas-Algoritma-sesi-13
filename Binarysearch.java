public class BinarySearch {

    // Method binary search
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // data tidak ditemukan
    }

    // Method utama
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int cari = 50;

        int hasil = binarySearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
