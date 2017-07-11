package mammadsgram;
import java.io.*;

public class User {
    String id;
    String username;
    String password;
    
    public void set_user_id(String id,String username,String password){
        this.id = id;
        this.password = password;
        this.username = username;
    }
    
    public void writeUserToFile(){
        try {
            FileWriter my_writer=new FileWriter("C:/Users/" + System.getProperty("user.name") + "/Documents/MammadsGram/pic 1/users.txt",true);
            my_writer.write("<1::" + this.username + ":::" + this.password + ">" + "\n");
            my_writer.close();

        }catch(IOException e){
            System.out.println("an i/o error \n");

        }
    }
    
    public void findUserFromFile(String username){
        
    }
    
    public void editUser(String id, String username, String password){
        this.id = id;
        this.password = password;
        this.username = username;
    }
    
}
