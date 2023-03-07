package org.additionalHomeWork.task1;

public class ReverseWithoutReverse {
    public String Reverse(String word){
        int buff = word.length() - 1;
        StringBuilder SB = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            SB.setCharAt(i, word.charAt(buff));
            buff--;
        }
        String reverseWord = SB.toString();
        return reverseWord;
    }
    public void ReverseCheck(String reverseWord,String word){
        if (reverseWord.equals(word)){
            System.out.println("слово поллиндром");
        }else {
            System.out.println("слово не поллиндром");
        }
    }
}
