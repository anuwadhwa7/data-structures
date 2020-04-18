package recursion;

import java.util.*;

class TowerOfHanoi{

    static void Hanoi(int n, char from, char aux, char to){
        if(n==1)
        {
            System.out.println("Move Disk 1 to Tower "+to+" from Tower "+from);
            return;
        }

        Hanoi(n-1,from,to,aux);

        System.out.println("Move disk from Tower "+from+" to Tower "+to);

        Hanoi(n-1,aux,from,to);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks in the Starting Tower");
        int n = sc.nextInt();

        System.out.println("Enter the Name of The Source Tower");
        char from = sc.next().charAt(0);
        System.out.println("Enter the Name of The Auxillary Tower");
        char aux = sc.next().charAt(0);
        System.out.println("Enter the Name of The Destination Tower");
        char to = sc.next().charAt(0);

        TowerOfHanoi m = new TowerOfHanoi();
        m.Hanoi(n, from, aux, to);
    }
}