public class MergeString_Alternatively {
        public static String mergeAlternately(String word1, String word2) {
            StringBuilder build=new StringBuilder();
            int n = Math.max(word1.length(), word2.length());
            for(int i=0;i<n;i++){
                if(i<word1.length()){
                    build.append(word1.charAt(i));
                }
                if(i<word2.length()){
                    build.append(word2.charAt(i));
                }
            }
            return String.valueOf(build);
        }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
}
