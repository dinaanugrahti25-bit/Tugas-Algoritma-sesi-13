public class JumpSearch {

    // Method jump search
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        // Melompat sampai elemen lebih besar atau sama dengan x
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        // Pencarian linear di blok yang ditemukan
        while (arr[prev] < x) {
            prev++;

            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == x)
            return prev;

        return -1;
    }

    // Method utama
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int cari = 70;

        int hasil = jumpSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
