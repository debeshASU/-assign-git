import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;

public class Validation {

    // checking the credentials when a student does login
    public String validate( String asu_id , String password )
    {

        String input = "" ;
        input += asu_id + password;

        try {
            File file = new File("src/studentDetails.txt");
            FileReader res = new FileReader(file);
            BufferedReader buffer = new BufferedReader(res);
            // list to store all the strings from file
            List<String> list = new ArrayList<>();
            String line;
            while((line=buffer.readLine())!=null)
            {
                list.add(line);
            }
            for( String str : list )
            {
                if( input.equals(str) )  // checking if both strings are equal
                {
                    return "Login Successful";
                }
            }

        }
        catch( Exception e )
        {
            e.printStackTrace();
        }

        return "Authentication Failed";
    }

}

