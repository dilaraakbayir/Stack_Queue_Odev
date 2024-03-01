package com.dilara;

import java.util.Scanner;
import java.util.Stack;

public class Soru1 {
    /*
   Dışarıdan bir kelime alıp bu kelimeyi bir stack'e ekleyelim, daha sonra bu stack
   üzerinde calısıp kelimenin palindrom olup olmadığını kontrol edelim.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < kelime.length(); i++) {
            stack.push(kelime.charAt(i));
        }
        boolean palindromMu = true;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) != stack.pop()) {
                palindromMu = false;
                break;
            }
        }
        if (palindromMu) {
            System.out.println(kelime + " kelimesi palindromdur.");
        } else {
            System.out.println(kelime + " kelimesi palindrom değildir.");
        }


    }







}
