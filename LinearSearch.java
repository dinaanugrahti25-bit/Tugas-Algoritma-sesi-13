public class LinearSearch {

    // Method linear search
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // data ditemukan
            }
        }
        return -1; // data tidak ditemukan
    }

    // Method utama
    public static void main(String[] args) {
        int[] data = {25, 10, 40, 30, 15, 50};
        int cari = 30;

        int hasil = linearSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
