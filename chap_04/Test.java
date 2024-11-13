package chap_04;

public class Test {
    public static String getHiddenData(String data, int number) {
        String hiddenData = data.substring(0,number);
        for (int i = 0; i < data.length() - number; i++) {
            hiddenData += "*";
        }
        
        return hiddenData;
    }


    public static void main(String[] args) {
        String name = "나코딩";
        String id = "010626-3842711";
        String phone = "010-7626-6672";

        System.out.println("이름 :" + getHiddenData(name, 1));
        System.out.println("주민등록번호 :" + getHiddenData(id, 8));
        System.out.println("전화번호 :" + getHiddenData(phone, 9));
    }
}
