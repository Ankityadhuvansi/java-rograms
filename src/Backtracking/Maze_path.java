package Backtracking;

import java.util.ArrayList;

public class Maze_path {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
        pathNames("",3,3);
        System.out.println(pathRetDiagonal("",3,3));
    }
     public static int countPath(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=countPath(r-1,c);
        int right= countPath(r,c-1);
        return left+right;
     }

     public static  void pathNames(String p,int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            pathNames(p+"D",r-1,c);
        }
        if(c>1){
            pathNames(p+"R",r,c-1);
        }
     }
     public static ArrayList<String> pathRetDiagonal(String p,int r,int c){
        if(c==1 || r==1){
            ArrayList<String>list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p+"D",r-1,c-1));
        }
         if(r>1){
             list.addAll(pathRetDiagonal(p+"D",r-1,c));
         }
         if(c>1){
             list.addAll(pathRetDiagonal(p+"R",r,c-1));
         }
         return list;
     }
}
