package kk123;

public class fanz {
	String str1 ="hello";
	public void reverseString(char[] str1) {
        int start = 0, end = str1.length-1;
        while(start < end){
            char temp = str1[start];
            str1[start] = str1[end];
            str1[end] = temp;
            start++;
            end--;
        }
    }
}