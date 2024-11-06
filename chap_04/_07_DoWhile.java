package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile

        //while 반복문
        int distance = 25; //전체 이동 거리
        int move = 0; //현재 이동 거리
        int height = 2;

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는:" + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println(" ---반복문#1---");

        //키가 아주 큰 사람
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는:" + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println(" ---반복문#2---");

        //DoWhile 반복문
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리" + move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
