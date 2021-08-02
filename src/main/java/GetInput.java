import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInput implements iGetInput{
    public void getAngleMessage(){
        System.out.println("Please input an angle:");
    }
    public void getVelocityMessage(){
        System.out.println("Please input a velocity:");
    }
    public String getTheInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return input;
    }
}
