package com.spartaglobal.Strings;

//Main method which calls word()
public class Palindrome {
    public static void main(String[] args) {
        word();
    }

    public static void word(){
        String s1 = "Racecar";
        String s2 = "Hello my name is Jamal and I have a racecar that is used for my madam";

        isPalindrome(s1);
        CountPalin(s2);
        revString("how are you doing ");

    }

    public static boolean isPalindrome(String word){
        int wordLength = word.length();
        String revString ="";

        for (int i = (wordLength - 1); i >=0; --i) {
            revString = revString + word.charAt(i);
        }

        if (word.equalsIgnoreCase(revString) && word.length()>3) {
            System.out.println(word + " is a Palindrome");
            return true;
        } else {
            return false;
        }
    }

    public static int CountPalin(String sentence){

        int palinCount = 0;
        String[] results = sentence.split(" ");
        int wordCount = results.length;

        for(int i = 0; i < results.length ;i++){
            if (isPalindrome(results[i]) && results[i].length() > 3){
                palinCount++;
            }

        }
        System.out.println(wordCount);
        System.out.println(palinCount);
        return palinCount ;
    }

    public static String revString (String str){

        String word = str;
        String revWord = new StringBuilder(word).reverse().toString();


        System.out.println(revWord);
        return revWord;

    }
}
