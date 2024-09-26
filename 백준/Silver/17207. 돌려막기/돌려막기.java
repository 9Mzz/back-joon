
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    /*
    다섯 개의 일을 처리해야 한다.
    최종 일량이 가장 적은 사람이 일처리를 맡는다.
    행렬 A는 5명의 사람이 생각한 5일의 난이도를 나타내는 5x5의 행렬이다. 사람 x 난이도 y
    행렬 B는 5명의 사람이 생각한 5일의 처리시간을 나타내는 5x5의 행렬이다. 사람 x 처리시간 y

    x의 y번째 일의 예상 일량은 x의 1번 일의 난이도 * 1번 사람의 y번째 일의 처리시간이다.
    1번부터 5번 일까지의 총처리 시간의 합이 가장 적은 사람이 제일 한가한 사람이다.

    결론: 5x5 행렬의 대칭의 합

    ToDo
     1. 두 행렬의 모양이 같음으로 행렬의 값을 구하는 메서드 하나를 만든다.
     2. 두 행렬을 오가며 parameter 값을 바꿔서 나온 두 값을 곱한다.
     3. 해당 값을 사람 객체의 시간 필드에 저장한다.
     4. 시간 순으로 내림차순 정렬하고 시간이 같으면 이름 순으로 오츰차순 재정렬한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] difficultyProcession = makeProcession(br);
        int[][] timeProcession = makeProcession(br);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            people.add(calculateTotalWorkTimeByPerson(difficultyProcession, timeProcession, i));
        }

        // 총시간 순으로 정렬 후 이름으로 재정렬
        people.sort(Comparator.comparingInt((Person p) -> p.totalWorkTime).thenComparing(Comparator.comparing((Person p) -> p.name).reversed()));
        System.out.println(people.get(0).name);
    }

    // 사람 이름과 시간 기록
    public static Person calculateTotalWorkTimeByPerson(int[][] difficultProcession, int[][] timeProcession, int personNo) {
        String name = null;
        switch (personNo) {
            case 0: name = "Inseo";
                break;
            case 1: name = "Junsuk";
                break;
            case 2: name = "Jungwoo";
                break;
            case 3: name = "Jinwoo";
                break;
            case 4: name = "Youngki";
                break;
            default: break;
        }

        int totalWorkTime = calculateTotalWorkTime(difficultProcession, timeProcession, personNo);

        return new Person(name, totalWorkTime);
    }


    // 한 사람의 총 일 처리 시간 계산
    public static int calculateTotalWorkTime(int[][] difficultyProcession, int[][] timeProcession, int personNo) {
        int totalWorkTime = 0;

        for (int taskNo = 0; taskNo < difficultyProcession.length; taskNo++) {
            int totalTaskTime = 0;

            for (int i = 0; i < difficultyProcession.length; i++) {
                totalTaskTime += findValueInProcession(difficultyProcession, personNo, i) * findValueInProcession(timeProcession, i, taskNo);
            }
            totalWorkTime += totalTaskTime;
        }
        return totalWorkTime;

    }

    // 값 찾아주는 로직
    public static int findValueInProcession(int[][] procession, int x, int y) {
        int value = procession[x][y];
        return value;
    }

    // 5*5 행렬 반환
    public static int[][] makeProcession(BufferedReader br) throws IOException {
        int[][] procession = new int[5][5];
        for (int i=0; i<5; i++) {
            procession[i] = readLine(br);
        }
        return procession;
    }

    // 입력값의 한 줄을 int 배열로 변환
    public static int[] readLine(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static class Person {
        String name;
        int totalWorkTime;

        public Person(String name, int totalWorkTime) {
            this.name = name;
            this.totalWorkTime = totalWorkTime;
        }
    }
}