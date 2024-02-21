package Enums;

import java.util.Arrays;

enum status{
    Running,failed,abort,success;
}
public class enums {
    public static void main(String[] args) {
        status statu= status.Running;
        System.out.println(statu);
        status[] ss=status.values();
        System.out.println(Arrays.toString(ss));
    }
}
