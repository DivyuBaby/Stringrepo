import java.util.*;

public class App {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    for(int i=0; i<2; i++){
        for(int j= 0;j<2;j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
   for(int i = 0;i<2;i++)
    {
        for (int j = 0; j < 2; j++) {
            b[i][j] = a[j][i];
        }
    }
    int flag = 0;
    for(int i = 0;i<2;i++)
    {
        for (int j = 0; j < 2; j++) {
            if(a[i][j] != b[i][j]){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            break;
        }
    }
    System.out.println((flag == 1 ? "Not Symmetric Matrix" : "Symmetric Matrix"));
    }
}
