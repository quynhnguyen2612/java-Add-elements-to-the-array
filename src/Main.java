//thêm phần tử vào mảng
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng ban đầu
        int[] arr = {1, 2, 3, 4, 5};

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        // Thêm phần tử mới vào mảng ở vị trí bất kỳ
        int newValue = 6;
        int index = 2; // Vị trí muốn thêm phần tử vào mảng (ví dụ: vị trí thứ 2)
        arr = addElementAtIndex(arr, newValue, index);

        // Hiển thị mảng sau khi thêm phần tử
        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(arr));
    }

    public static int[] addElementAtIndex(int[] arr, int newValue, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = newValue;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
}
