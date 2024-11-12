package chap_06;

public class _06_WhenToUse {

    public static int power(int number, int exponent) {
        int resilt = 1;
        for (int i = 0; i < exponent; i++) {
            resilt *= number;
        }
        return resilt;
    }


    public static void main(String[] args) {
        //메소드가 필요한 이유
        
        //2의 2승 구하기

        System.out.println(power(2, 2));

        //3의 3승 구하기
        System.out.println(power(3, 3));

        //4의 2승 구하기
        System.out.println(power(4, 2));
    }
}
