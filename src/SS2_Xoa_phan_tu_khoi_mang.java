import java.util.Scanner;

public class SS2_Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int indexArr = 5;
        System.out.print("Mảng ban đầu là: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Nhập x là giá trị muốn xóa: ");
        int x = sr.nextInt();
        int index=0;
        boolean check = false;
        for (int i = 0; i < indexArr; i++) {
            if (arr[i] == x) {
                check = true;
                index=i;
            }
        }
        if (check){
            System.out.println("Phần tử "+x+" có trong mảng và ở vị trí thứ: "+index);
            for (int i=index;i<indexArr;i++){
                arr[i]=arr[i+1];
            }
            arr[indexArr]=0;
            System.out.print("Mảng sau khi xóa là: ");
            for (int i:arr
                 ) {
                System.out.print(i+" ");

            }

        }else {
            System.out.println("Không có phần tử "+x+" trong mảng!");
        }


    }
}

