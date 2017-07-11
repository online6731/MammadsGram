package mammadsgram;

import java.io.FileWriter;
import java.io.IOException;

public class Comment {
    String content;
    String id;
    int likes, dislikes, numberofcoment;
    
    Comment(){

    }
    
    public String str(){
        return content;
    }

    public void write(){
        try {
            FileWriter my_writer = new FileWriter("C:/Users/" + System.getProperty("user.name") + "/Documents/MammadsGram/pic 1/comments.txt",true);
            my_writer.write("<1:::" + content + ">" + "\n");
            my_writer.close();
            
        }catch(IOException e){
            System.out.println("an i/o error \n");
        }
         
    }
   
}
