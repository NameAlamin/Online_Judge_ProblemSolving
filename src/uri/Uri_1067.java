package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x,i;
        x = Integer.parseInt(reader.readLine());
        for(i=1;i<=x;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
