public class Unimodal {
    public static int findPeak(int[] A) {
        int n = A.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if ((m == 0 || A[m-1] < A[m]) && (m == n-1 || A[m+1] < A[m])) {
                return m;
            } else if (m > 0 && A[m-1] > A[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 8, 6, 4, 2};
        int peak = findPeak(A);
        System.out.println("Peak element is at index " +peak);
}
}
