package hello_around_world;

import edu.duke.FileResource;

public class HelloAroundWorld {
    public  void sayHello(){
        FileResource name = new FileResource();
        for(String f : name.lines()){
            System.out.println(f);
        }
    }
    public static void  main(String[] arg){
        HelloAroundWorld ob = new HelloAroundWorld();

        ob.sayHello();
    }
}
