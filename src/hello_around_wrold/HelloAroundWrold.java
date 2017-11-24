package hello_around_wrold;

import edu.duke.FileResource;

public class HelloAroundWrold {
    public  void sayHello(){
        FileResource name = new FileResource();
        for(String f : name.lines()){
            System.out.println(f);
        }
    }
    public static void  main(String[] arg){
        HelloAroundWrold ob = new HelloAroundWrold();

        ob.sayHello();
    }
}
