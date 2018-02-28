/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaesarCipher;

import java.util.Scanner;

/**
 *
 * @author thecoderschool
 */
public class cipher {
    
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public static String encrypt(String plainText, int shiftKey) {
        String encryptEd = "";
 
        
        for (int i = 0; i<plainText.toLowerCase().length();i++) {
            
            char letter;
            int letterPosition;
            int newPosition;
            
            
            letter = plainText.charAt(i);
            letterPosition = ALPHABET.indexOf(letter);
            //System.out.println(letterPosition);
            newPosition = (shiftKey+letterPosition)% 26;
            //System.out.println(newPosition);
            char newLetter = ALPHABET.charAt(newPosition);
            encryptEd = encryptEd+newLetter;
        }        
        return encryptEd;
        
    }
    
   /*public static String decrypt(String encryptedText, int shiftKey) {
        String duhhhhh = "";
        for (int i=0; i<encryptedText.toLowerCase().length();i++) {
            char letter;
            int letterPosition;
            int newPosition;
            
            letter = encryptedText.charAt(i);
            letterPosition = ALPHABET.indexOf(letter);
            
            newPosition = (letterPosition-shiftKey);
            
            //System.out.println(newPosition);
            //System.out.println(letterPosition);
            
            if (newPosition < 0) {
                int newNewPosition = newPosition;
                newPosition = 24-newNewPosition;
            }
            
            else if (newPosition > 25) {
                int newNewPosition = newPosition;
                newPosition = newNewPosition-24;  
            }
            
            char newLetter = ALPHABET.ch
        }arAt(newPosition);
            duhhhhh = duhhhhh+newLetter;
        return duhhhhh;
        
    };*/
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String stupid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Print your message below");
        stupid = sc.next();
        String outOfIdeas;
        outOfIdeas = encrypt(stupid, (int) Math.floor(Math.random()*26));
                
        System.out.println(outOfIdeas);
        
        for (int i = 0;i<26; i++) {
            System.out.println(i);
            System.out.println(encrypt(outOfIdeas,26-i));
        }
    }
    
    
    
}
