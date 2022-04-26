package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i,number;
        number = Integer.parseInt(reader.readLine());
        if(number%2 == 0){
            number++;
        }
        for (i=1;i<=6;i++){
            System.out.println(number);
            number = number+2;
        }
    }
}
