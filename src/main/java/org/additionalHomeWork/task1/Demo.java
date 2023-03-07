package org.additionalHomeWork.task1;

public class Demo {
    public static void main(String[] args) {
        String newWord;
        String newReverseWord;
        ReverseWithoutReverse rwr = new ReverseWithoutReverse();
        newWord = UserInput.UI();
        newReverseWord = rwr.Reverse(newWord);
        rwr.ReverseCheck(newReverseWord,newWord);
    }
}
