public class Main {
    public static void main(String[] args){
        Solution solution=new Solution();
        ReverseNum reverseNum=new ReverseNum();
        InsertArea insertArea=new InsertArea();
        int a[]={1,3,5,6};
        System.out.println(insertArea.searchInsert(a,7));
        System.out.println(reverseNum.reverse(
                -1123));
        System.out.println(  solution.isPalindrome(-10));
    }
}
