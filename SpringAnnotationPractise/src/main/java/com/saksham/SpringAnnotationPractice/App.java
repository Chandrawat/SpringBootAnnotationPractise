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
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        // With using XML use below code
        //TvRemote remote = (TvRemote) context.getBean("tvRemote");
        
        // for @Annotations use this
       //TvRemote remote = (TvRemote) context.getBean(TvRemote.class);
        
        //remote.performAction();
       
        College college = context.getBean("collegeBean", College.class);
        System.out.println("All methods works \t"+ college);
    }
}
