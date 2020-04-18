package recursion;

import java.util.*;

public class isSorted {

    static int isArrayInSortedOrder(int [] A, int index)
    {
        if(A.length == 1)
        {
            return 1;
        }
        return(A[index-1] < A[index-2])?0:isArrayInSortedOrder(A, index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index of the array");
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];

        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        isSorted m = new isSorted();
        m.isArrayInSortedOrder(a,n);

    }
}
