/*
짝수는 싫어요
문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	[1, 3, 5, 7, 9]
        15	[1, 3, 5, 7, 9, 11, 13, 15]
입출력 예 설명
입출력 #1

        10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
입출력 #1

        15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.*/
package programmers;

import java.util.Arrays;

public class Introduction12 {  // 클래스 이름을 대문자로 수정
    public int[] solution(int n) {
        // 홀수의 개수를 계산
        int count = (n + 1) / 2;

        // 홀수를 저장할 배열 생성
        int[] answer = new int[count];

        // 배열에 홀수를 채움
        for (int i = 0; i < count; i++) {
            answer[i] = 2 * i + 1;
        }

        return answer;
    }

    // main 메서드를 클래스 바깥에 추가
    public static void main(String[] args) {
        // 예시로 main 메서드에서 테스트 실행
        Introduction12 introduction12 = new Introduction12();
        int[] result = introduction12.solution(10);  // 홀수의 개수 10일 때
        System.out.println(Arrays.toString(result));  // 출력: [1, 3, 5, 7, 9]
    }
}
