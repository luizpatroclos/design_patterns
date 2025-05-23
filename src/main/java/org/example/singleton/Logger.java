package org.example.singleton;

public class Logger {

    String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    private static Logger instance = null;


    //Java class by default hide the default constructor which is "public"
    // In order to create a Singleton we need to declare explicit the Default constructor as "private"
    private Logger(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Logger(String content, String type) {
        this.content = content;
        this.type = type;
    }


    //Singletons must implement a static method returning the instance
    public static Logger getinstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

}
