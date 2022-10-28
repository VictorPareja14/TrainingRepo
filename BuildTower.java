package BuildTower;

public class BuildTower {
    public static void main (String [] args){
        towerBuilder(6);

    }
    public static String[] towerBuilder(int nFloors) {


                String asterisk="*";
                String array [] = new String[nFloors];
                int i=0;
                while(i<nFloors){
                    if(i==0) {
                        //System.out.println(" " + asterisk + " ");
                        array[i]=asterisk;
                        i++;
                    }
                    if(i>=1){
                        String duplicatedAsterisk=asterisk+="**";
                        //System.out.println(" "+duplicatedAsterisk+" ");
                        array[i]=duplicatedAsterisk;
                        i++;

                    }
                }


        for (int o = 0; o < array.length ; o++) {
            System.out.printf("[%5s] %n",array[o]);

        }


        return new String[]{array[0]};
    }
}
