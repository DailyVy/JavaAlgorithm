public class MySort {
    void insertSorting(int [] numArray) {
        // 삽입 정렬은 첫번째 값은 두고 두번째 값부터 비교하면 된다.
        for (int i = 1; i < numArray.length; i++) {
            for (int j = i-1, k = i; j >= 0; j--, k--) {
                if (numArray[k] < numArray[j]) {
                    swap(numArray, k, j);
                }
                else break;
            }
        }
    }

    // int 배열의 i번째와 j번째를 바꾸는 메서드
    void swap(int [] a, int i, int j) {
        // 1. 예외처리
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 2. 바꿔봅시다
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 모두의 알고리즘 with 파이썬의 삽입정렬과 비슷하게 짠거
    void insertSortPython(int [] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            int key = numArray[i];
            int j = i - 1;

            while(j >= 0 && numArray[j] > key) {
                numArray[j+1] = numArray[j];
                --j;
            }
            numArray[j+1] = key;
        }
    }
}
