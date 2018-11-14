/*
给定一个 32 位有符号整数，将整数中的数字进行反转。
示例 1:
输入: 123
输出: 321
 示例 2:
输入: -123
输出: -321
示例 3:
输入: 120
输出: 21
注意:
假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class ReverseNum {
        public int reverse(int x) {
            Integer a=new Integer(x);
            String str=a.toString();
            String[] arr=new String[str.length()];
            for(int i=0,j=1;i<str.length();i++,j++){
                arr[i]=str.substring(i,j);
            }
            StringBuffer strb=new StringBuffer();
            if("-".equals(arr[0])){
                strb.append("-");
                for(int i=arr.length-1;i>=1;i--)
                    strb.append(arr[i]);
            }else {
                for(int i=arr.length-1;i>=0;i--)
                    strb.append(arr[i]);
            }

            try {
                int num = Integer.parseInt(strb.toString());
                return num;
            }catch (NumberFormatException exception){
                exception.printStackTrace();
                return  0;
            }
        }
}
