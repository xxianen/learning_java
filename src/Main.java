public class Main {
    public static void main(String[] args) {
        float num1 = 3f;
        int num2 = 5;

        System.out.println( num1 + num2 );
        System.out.println( num1 - num2 );
        System.out.println( num1 * num2 );
        System.out.println( num1 / num2 );
        System.out.println( num2 % num1 );
        System.out.println( (num2 + num1) * num1 );

        //abbrievation
        int specialnum = 0;

        specialnum += 2; //specialnum = specialnum + 2
        System.out.println(specialnum);

        specialnum -= 2;
        System.out.println(specialnum);

        specialnum *= 2;
        System.out.println(specialnum);

        specialnum /= 2;
        System.out.println(specialnum);

        //prefix & postfix increment (++=+1,--=-1)
        int num = 0;
        System.out.println(++num);

        int numnum = 0;
        System.out.println(numnum++);
        System.out.println(numnum++);
        System.out.println(numnum);
    }
}