public class ExponentialSearch {

    // Binary Search (digunakan oleh Exponential Search)
    public static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Method exponential search
    public static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        // Jika elemen pertama adalah yang dicari
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        // Panggil binary search pada range tertentu
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    // Method utama
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int cari = 80;

        int hasil = exponentialSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
