public class LinearSearch {

    public static void main(String[] args) {

        //배열임의로 생성
        int[] arr = new int[]{9, 5, 6, 4, 7, 2, 1, 8, 3};
        //검색할 값 x
        int x = 8;


        System.out.println ( toString ( arr ) );
        System.out.println ( "검색값  : " + x );

        // 검색
        int result = linearSearch ( arr, x );

        if (result == -1) {
            System.out.println ( "검색값이 없습니다" );
        } else {
            System.out.print ( "가운데 값: " + result );
        }
    }

    public static int linearSearch(int arr[], int x) {
        int n = arr.length;

        //순차적으로 arr[]각 요소와 x를 하나씩 비교
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                // 일치할경우 인덱스 반환
                return i;
            }
        }
        //일치하지 않을 경우 -1 반환
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
