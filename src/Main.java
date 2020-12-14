import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng:");
        int size=sc.nextInt();
        int []arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("nhập giá trị của mảng");
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.printf("%-50s%s", "Element in array","");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"");
        }
        for (int j = 0; j < arr.length/2; j++) {
            int temp=arr[j];
            arr[j]=arr[size-1-j];
            arr[size-1-j]=temp;
        }
        System.out.printf("%-10s%s","Reverse array","");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");

        }

    }
}