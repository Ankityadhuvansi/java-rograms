public class ReverseVowelOf_String {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        String vowels = "aeiouAEIOU";
        int end = arr.length - 1;
        while (start < end) {
            // Move start pointer until it points to a vowel
            while (start < end && vowels.indexOf(arr[start]) == -1) {
                start++;
            }

            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(arr[end]) == -1) {
                end--;
            }

            // Swap the vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        return new String(arr);
    }
}
