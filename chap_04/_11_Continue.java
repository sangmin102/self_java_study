package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문손님중에 노쇼 손님이 있다고 가정

        int max = 20; //최대 치킨 판매 수
        int sold = 0; //현재 치킨 판매 수
        int noShow = 17;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");

            //손님이 없다면?? (noShow)
            if(i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if(sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }

        }
        System.out.println("금일 영업을 종료 합니다.");

        System.out.println("================================");

        //while 문
        sold = 0;
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");

        }
    }
}
