/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author dany
 */
public class JavaApplication1 {

    public static boolean checkSum(int[] elements, int sum) {

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] + elements[j] == sum) {
                    return true;
                }
            }
        }
        return false;

    }

    public static String reverseString(String str) {

        String sb = new String();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb = sb + (str.charAt(i));
        }
        return sb;
    }
    
    public static String reverseStringQuick(String str) {
        
        char[] sb = str.toCharArray();
        int last = str.length();
        
        for(int i = 0; i <= (last -1) /2; i++)
        {
            char firstChar = str.charAt(i);
            int end = (last-1) -i;
            char lastChar = str.charAt(end);
            sb[i] = lastChar;
            sb[end] = firstChar;
        }
        
        return String.copyValueOf(sb);
    }

    public static void main(String[] args) {
        int example1[] = {1, 2, 3, 9};
        int sum1 = 8;
        boolean result1 = checkSum(example1, sum1);
        System.out.printf(
                "Case 1\n Array %s\n Sum %d\n Result %b\n", 
                Arrays.toString(example1), 
                sum1, 
                result1
        );

        int example2[] = {1, 2, 4, 4};
        int sum2 = 8;
        boolean result2 = checkSum(example2, sum2);
          System.out.printf(
                "Case 2\n Array %s\n Sum %d\n Return %b\n", 
                Arrays.toString(example2), 
                sum2, 
                result2
        );
        
        String str1 = "Hello World, Java";
        String str2 = "I like develop in Java Code";
        
        System.out.printf("My sting 1 is %s\n", str1);
        System.out.printf("My reversed sting 1 is %s\n", reverseString(str1));
        
        System.out.printf("My sting 2 is %s\n", str2);
        System.out.printf("My reversed sting 2 is %s\n", reverseStringQuick(str2));   
    }
}
