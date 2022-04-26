package uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i,number,count=0;
        for(i=1;i<=5;i++){
            number = Integer.parseInt(reader.readLine());
            if(number%2 == 0){
                count = count + 1;
            }
        }
        System.out.println(count+" valores pares");
    }
}
