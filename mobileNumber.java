package es.MobileNumber;

import java.util.Arrays;

public class mobileNumber {
    static int [] phoneNumber = {1,2,3,4,5,6,7,8,9,0};
    public static void main(String[] args) {
        createPhoneNumber(phoneNumber);

    }
    public static String createPhoneNumber(int [] numbers) {

        String primero = "";
        String segundo = "";
        String tercero = "";


        String[] strArray = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        String[] a = Arrays.copyOfRange(strArray, 0, 3);
        String [] b = Arrays.copyOfRange(strArray,3,6);
        String [] c = Arrays.copyOfRange(strArray,6,10);

        primero= toString(a);

        for (int i = 0; i <b.length ; i++) {
            segundo+=b[i];
        }
        for (int i = 0; i <c.length ; i++) {
            tercero+=c[i];
        }

        System.out.println(primero+" "+segundo+"-"+tercero);


            return "";
        }
        public static String toString(Object[] a) {
                if (a == null)
                    return "null";

                int iMax = a.length - 1;
                if (iMax == -1)
                    return "[]";

                StringBuilder b = new StringBuilder();
                b.append('(');
                for (int i = 0; ; i++) {
                    b.append(String.valueOf(a[i]));
                    if (i == iMax)
                        return b.append(')').toString();
                    b.append("");
                }
        }
}

