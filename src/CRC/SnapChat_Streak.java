package CRC;

public class SnapChat_Streak {
    public static String Streak(int[] X,int[] Y){
        int streakX=0,streakY=0;
        for (int num:X) {
            if(num!=0){
                streakX++;
            }else {
                streakX=0;
                streakY=0;
            }
        }
        for (int num:Y) {
            if(num!=0){
                streakY++;
            }else {
                streakY=0;
                streakX=0;
            }
        }
        if(streakX==streakY){
            return "X=Y";
        }
        return (streakX>streakY)?"X":"Y";
    }
    public static void main(String[] args) {
        int[] arr1={0,0,0,0};
        int[] arr={0,0,0,1};
        System.out.println(Streak(arr1,arr));
    }
}
