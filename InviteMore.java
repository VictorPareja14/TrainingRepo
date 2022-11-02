package BuildTower;

import java.util.Arrays;

public class InviteMore {
    public  static void main(String [] args ){
        int [] a= {1,-1,1};
        System.out.println(inviteMoreWomen(a));

    }
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0 ? true : false;
        //ALSO--> return Arrays.stream(l).sum() > 0;

    }
}
