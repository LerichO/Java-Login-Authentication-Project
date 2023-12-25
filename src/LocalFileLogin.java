import java.io.*;
import java.util.Scanner;

public class LocalFileLogin {

    //declare the location to store text file of location credentials
    private final static String CREDENTIALS_LOCATION = System.getProperty("user.dir");

    //declare file IO and Scanner
    private File credentialsFile;
    private BufferedWriter out;
    private Scanner scan;

    public LocalFileLogin() {

        //initialize IO
        credentialsFile = new File(CREDENTIALS_LOCATION + "\\credentials.txt");

    }

    public boolean logIn(String username, String password) throws IOException{

        return true;
    }

    public boolean signUp(String username, String password) throws IOException{
        out = new BufferedWriter(new FileWriter(credentialsFile, true));
        Scanner scan = new Scanner(CREDENTIALS_LOCATION + "\\credentials.txt");

        while(scan.hasNextLine()){

        }
        return true;
    }

    private boolean checkForLogIn(String storedUser, String storedPass) throws IOException{

        return true;
    }

}
