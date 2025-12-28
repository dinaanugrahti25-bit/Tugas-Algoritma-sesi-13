public class InterpolationSearch {

    // Method interpolation search
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {

            // Menghindari pembagian dengan nol
            if (low == high) {
                if (arr[low] == x)
                    return low;
                return -1;
            }

            // Rumus interpolasi
            int pos = low + ((x - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            if (arr[pos] == x)
                return pos;

            if (arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }

    // Method utama
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int cari = 70;

        int hasil = interpolationSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
