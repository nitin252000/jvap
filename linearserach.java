import java.util.Scanner;
public class linearserach {
    void insert()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elemnts");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to searcch");
        int l = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == l) {
                count++;
            }
        }
        System.out.println("elements are" + count);
    }

    public static void main(String[] args) {
        linearserach ob = new linearserach();
        ob.insert();
    }
}
