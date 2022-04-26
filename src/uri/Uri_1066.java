package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1066 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number,i,even=0,odd=0,pos=0,neg=0;
        for(i=1;i<=5;i++){
            number = Integer.parseInt(reader.readLine());
            if(number %2 == 0){
                even++;
            }
            if(number %2 != 0){
                odd++;
            }
            if(number > 0){
                pos++;
            }if(number < 0){
                neg++;
            }
        }
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(pos+ " valor(es) positivo(s)");
        System.out.println(neg+ " valor(es) negativo(s)");
    }
}
