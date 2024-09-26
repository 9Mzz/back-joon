import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yellow_melon = sc.nextInt();

        int[] arr = new int[6];
        int maxWidth = 0, maxHeight = 0, maxWidthNum = 0, maxHeightNum = 0;

        for (int i = 0; i < 6; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = y;

            if ((x == 1 || x == 2) && maxWidth < y) {
                maxWidth = y;
                maxWidthNum = i;
            } else if ((x == 3 || x == 4) && maxHeight < y) {
                maxHeight = y;
                maxHeightNum = i;
            }
        }

        int right,left,minWidth,minHeight;

        if (maxWidthNum + 1 == 6)
            right = 0;
        else
            right = maxWidthNum + 1;

        if (maxWidthNum - 1 == -1)
            left = 5;
        else
            left = maxWidthNum - 1;
        //빈 사각형의 세로 길이
        minHeight = Math.abs(arr[right] - arr[left]);

        if (maxHeightNum + 1 == 6)
            right=0;
        else
            right = maxHeightNum + 1;

        if (maxHeightNum - 1 == -1)
            left=5;
        else
            left = maxHeightNum - 1;
        //빈 사각형의 가로 길이
        minWidth = Math.abs(arr[right] - arr[left]);

        System.out.println(((maxWidth * maxHeight) - (minWidth * minHeight)) * yellow_melon);
    }
}