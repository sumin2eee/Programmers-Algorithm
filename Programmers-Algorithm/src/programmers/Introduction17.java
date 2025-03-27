package programmers;

public class Introduction17 {

    public int solution(int price) {
        if (price >= 500000) {
            price = (int) (price * 0.8); // 20% 할인
        } else if (price >= 300000) {
            price = (int) (price * 0.9); // 10% 할인
        } else if (price >= 100000) {
            price = (int) (price * 0.95); // 5% 할인
        }
        return price;
    }

    public static void main(String[] args) {
        Introduction17 introduction17 = new Introduction17();
        System.out.println(introduction17.solution(150000) + "원"); // 142500원
        System.out.println(introduction17.solution(580000) + "원"); // 464000원
    }
}
