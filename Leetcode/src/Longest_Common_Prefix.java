class Longest_Common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
     static String longestCommonPrefix(String[] strs) {
        StringBuilder str= new StringBuilder();
        int n;
        for(int i=0;i<strs.length;i++){
            for(int j=1;j<strs.length;j++){
                n = Math.min(strs[i].length(), strs[j].length());
                for (int k = 0; k <n; k++) {
                    if(strs[i].charAt(k)==strs[j].charAt(k)){
                        str.append(strs[i].charAt(j));
                    }
                }
            }
        }
        return str.toString();
    }
}