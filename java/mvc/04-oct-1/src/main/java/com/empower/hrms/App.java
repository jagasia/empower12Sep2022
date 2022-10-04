package com.empower.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.hrms.config.MyConfiguration;
import com.empower.hrms.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ctx.scan("com.empower");
//        ctx.refresh();
        Car car = ctx.getBean(Car.class);
        car.startMusic();
    }
}
