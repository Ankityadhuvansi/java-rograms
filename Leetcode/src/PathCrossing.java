import java.util.Arrays;

class PathCrossing{
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pair=new int[spells.length];
        int m=0;
//        for(int k=0;k<spells.length*potions.length;k++){
//            int i=k/potions.length;
//            int j=k%potions.length;
//            int count=0;
//            int pro=spells[i]*potions[j];
//            if(pro!=potions[j]){
//                count++;
//            }
//            pair[m++]=count;
//        }
        int k=0;
        for (int i = 0; i < spells.length; i++) {
            int count=0;
            for (int j = 0; j < potions.length; j++) {

                int pro=spells[i]*potions[j];
                if((pro!=spells[i])&&(pro!=potions[j])&& pro>=success) {
                    count++;
                }
            }
            pair[k++]=count;
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] spell={5,1,3};
        int[] potions={1,2,3,4,5};
        System.out.println(Arrays.toString(successfulPairs(spell,potions,7)));
    }
}