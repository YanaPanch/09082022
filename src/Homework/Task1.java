package Homework;

import java.util.Scanner;

public class Task1 {

    public static String sentence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter the sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    public static int anoundOfLettersInLongestWordInSentence(String str){
        str += " ";
        String word = "";
        String longestWord = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > longestWord.length())
                    longestWord = word;
                word = "";
            } else {
                word += ch;
            }
        }
        return longestWord.length();
    }

    public static String longestWordInSentence(String str) {
        str += " ";
        String word = "";
        String longestWord = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > longestWord.length())
                    longestWord = word;
                word = "";
            } else {
                word += ch;
            }
        }
        return longestWord;
    }

    public static String reverse(String str) {
        String[] strArray = str.split(" ");
        int length = strArray.length;
        int n = 2;

        String str2 = strArray[n-1];
        //System.out.println("str2: "+str2);
        String strrev2 = strArray[length-n];
        //System.out.println("strrev2: "+strrev2);

        char temp;
        char[] str2CharArr = str2.toCharArray();
        char[] strrev2CharArr = strrev2.toCharArray();
        int str2CharArrLen = str2CharArr.length;
        int strrev2CharArrLen = strrev2CharArr.length;
        //System.out.println("str2CharArrLen: "+str2CharArrLen);
        //System.out.println("strrev2CharArrLen: "+strrev2CharArrLen);

        for(int i=0,j=str2CharArrLen-1;i<str2CharArrLen/2;i++,j--) {
            temp = str2CharArr[i];
            str2CharArr[i] = str2CharArr[j];
            str2CharArr[j] =  temp;
        }
        String str2CharArrRev = String.valueOf(str2CharArr);
        //System.out.println("str2CharArr after reverse: "+str2CharArrRev);

        for(int i=0,j=strrev2CharArrLen-1;i<strrev2CharArrLen/2;i++,j--) {
            temp = strrev2CharArr[i];
            strrev2CharArr[i] = strrev2CharArr[j];
            strrev2CharArr[j] =  temp;
        }
        String strrev2CharArrRev = String.valueOf(strrev2CharArr);
        //System.out.println("strrev2CharArr after reverse: "+strrev2CharArrRev);

        strArray[n-1] = str2CharArrRev;
        strArray[length-n] = strrev2CharArrRev;
        //System.out.println("strArray[n-1]: "+strArray[n-1]);
        //System.out.println("strArray[len-n]: "+strArray[len-n]);

        String revStr = "";
        for(int i=0; i<length;i++) {
            revStr += strArray[i]+" ";
        }
        return revStr;
    }

}
