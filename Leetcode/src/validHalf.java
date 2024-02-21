class validHalf {
    public static boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String[] parts = {s.substring(0, mid), s.substring(mid)};
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(vowelCount(parts[0]));
        System.out.println(vowelCount(parts[1]));
        return vowelCount(parts[0]) == vowelCount(parts[1]);
    }
//    public static int vowelCount(String string){
//        string=string.toLowerCase().replaceAll("[^a-zA-z0-9]","");
//        String vowel="aeiouAEIOU";
//        int start=0;
//        int end=string.length();
//        int count=0;
//        while (start<end){
//            if(vowel.indexOf(string.charAt(start))!=-1){
//                count++;
//            }
//            start++;
//        }
//        return count;
//    }
    public static int vowelCount(String string){
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
        String string="book";
        System.out.println(halvesAreAlike(string));
    }
}