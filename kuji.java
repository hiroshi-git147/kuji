import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] you = new int[6];
        int com[] = new int[6];
        
        for(int i = 0; i < you.length; i++) {
            you[i] = sc.nextInt();
            System.out.print(you[i] + " ");
        }
        System.out.println("");
        
        int num = sc.nextInt();
        
        for(int j = 0; j < num; j++) {
            for (int k = 0; k < com.length; k++) {
                com[j] = sc.nextInt();
                System.out.print(com[j] + " ");
            }
        System.out.println("");
        }
    }
}
