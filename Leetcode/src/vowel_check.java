public class vowel_check {
    public static int vowelCount(String string){
        string=string.toLowerCase().replaceAll("[^a-zA-z0-9]","");
        String vowel="aeiouAEIOU";
        int start=0;
        int end=string.length()-1;
        int count=0;
        while (start<=end){
            if(vowel.indexOf(string.charAt(start))!=-1){
                count++;
            }
            start++;
        }
        return count;
    }
    public static int vowelCount1(String string){ // Optimized function
        int count=0;
        String vowel="aeiouAEIOU";
        for (char ch:string.toCharArray()) {
            if (vowel.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string="BOOk";
        System.out.println(vowelCount(string));
    }
}
