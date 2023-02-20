public class ReverseWord {
    public static String reverseWords(String s) {
        char[] wordArray = s.toCharArray();
        int slowPtr = 0;
        int fastPtr = 0;

        while(fastPtr <= wordArray.length){
            if(fastPtr == wordArray.length || wordArray[fastPtr] == ' '){
                reverse(wordArray, slowPtr, fastPtr - 1);
                slowPtr = fastPtr + 1;
            }

            fastPtr++;
        }

        return new String(wordArray);
    }

    private static void reverse(char[] word, int start, int end){
        while(start < end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println("Reversed String: " + reverseWords(s));
    }
}
