package com.saksham.SpringAnnotationPractice;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
        
        // With using XML use below code
        //TvRemote remote = (TvRemote) applicationContext.getBean("tvRemote");
        
        // for @Annotations use this
        TvRemote remote = (TvRemote) applicationContext.getBean(TvRemote.class);
        
        remote.performAction();
    }
}
