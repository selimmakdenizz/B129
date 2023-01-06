package advancedpractice05;

public class Q05_Arrays_ToplamVeVeriler2 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, -10, 8, 5, 20};

        ikililleriBul(arr, 10);

    }

    public static void ikililleriBul(int[] arr, int toplam) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == toplam) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + toplam);
                }
            }
        }
    }
}

