package org.prog.session6.sample;

public class BaseTest {
    protected String environment;
    
    protected String getTestHost(){
        if (environment.equals("DEV")){
            return "http://dev.google.com";
        }
        if (environment.equals("STAGE")){
            return "http://stage.google.com";
        }
        return null;
    }
}
