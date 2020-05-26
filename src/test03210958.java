public class test03210958 {

    public static void test() {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("........");
        }
        int[][] arrs = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrs[i][j] = arr[j][i];
            }
        }
        System.out.println("---------------------------");
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                System.out.println(arrs[i][j]);
            }
            System.out.println("........");
        }

    }
    public static void main(String[] args){
        test03210958.test();
    }

}
