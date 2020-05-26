import java.util.HashSet;
import java.util.Set;

/*
给定一个字符串，找出不含有重复字符的最长子串的长度。
示例 1:
输入: "abcabcbb"
输出: 3
解释: 无重复字符的最长子串是 "abc"，其长度为 3。
示例 2:
输入: "bbbbb"
输出: 1
解释: 无重复字符的最长子串是 "b"，其长度为 1。
示例 3:
输入: "pwwkew"
输出: 3
解释: 无重复字符的最长子串是 "wke"，其长度为 3。
     请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */


public class LeetCoodeString {
    public static void main(String args[]){
        Set<Short> s=new HashSet<Short>();
        for(Short i=0;i<100;i++){
            s.add(i);
            s.remove(i-1);
        }
        System.out.println(s.size());
    }

}
