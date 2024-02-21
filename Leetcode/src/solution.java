class solution {
    public static boolean halvesAreAlike(String s) {
        int mid=s.length();
        String[] parts = {s.substring(0, mid), s.substring(mid)};
        return vowelCount(parts[0]) == vowelCount(parts[1]);
    }
    public static int vowelCount(String string){
        string=string.toLowerCase().replaceAll("[^a-zA-z0-9]","");
        String vowel="aeiouAEIOU";
        int start=0;
        int end=string.length();
        int count=0;
        while (start<end){
            if(vowel.indexOf(string.charAt(start))!=-1){
                count++;
            }
            start++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string="book";
        System.out.println(halvesAreAlike(string));
    }
}