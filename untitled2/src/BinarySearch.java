

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{4,1,5,6,2,3,7,8,9};
        //정렬
        Arrays.sort(arr);
        //검색할 값 x
        int x = 8;

        System.out.println ( toString ( arr ) );
        System.out.println("검색 값  : " + x );

        // 오른쪽에 있을 경우
        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("검색 값이 없습니다 ");
        }else {
            System.out.println("index 몇번째: " + result);
        }

    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length -1;

        //왼쪽위치가 오른쪽 위치보다 커질때까지 반복
        while (left <= right) {
            //중간요소 위치 계산
            int mid = left + (right-left)/2;

            // 중간 요소와 일치하면 중간 인덱스를 반환
            if(arr[mid] == x) {
                return mid;
            }

            // x가 중간 요소보다 클 경우
            if(arr[mid] < x) {
                // 중간 요소 다음의 오른쪽 절반 하위 배열에만 놓고, 오른쪽 절반을 반복
                // 왼쪽 위치 재조정
                left = mid + 1;

                // x가 중간 요소 보다 작은 경우
            }else {
                // 왼쪽 절반 하위 배열만 놓고, 왼쪽 절반에 반복
                // 오른쪽 위치 재조정
                right = mid - 1;
            }
        }
        //찾을수 없을 경우 -1 반환
        return -1;
    }
    public static String toString(int arr[]) {
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
            if (i < arr.length - 1) {
                str = str + ",";
            }
        }
        return str + "]";
    }

}