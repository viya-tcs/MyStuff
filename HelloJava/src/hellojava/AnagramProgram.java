/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Arrays;

/**
 *
 * @author thecoderschool
 */
public class AnagramProgram {
    static String isAnagram(String s1, String s2) {
        boolean status = true;
        String result = "";
        
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
       
        status = Arrays.equals(s1Array, s2Array);
        
        if(status) {
            result = s1+" and " +s2+ " are anagrams. ";
        } else {
            result = s1+" and " +s2+ " are NOT anagrams. ";
        }
       
        return result;
    }
    
    /*public static void main(String[] args) {
        isAnagram("keEp", "peeK");
        System.out.println(isAnagram("keEp", "peeK"));
        System.out.println(isAnagram("School MASTER", "The classROOM"));
        System.out.println("The answer to the question is " + 1569/73f + ".");
        System.out.println("To prove it, 21.49315x73 is " + 21.49315*73 + ".");
    }*/
}
