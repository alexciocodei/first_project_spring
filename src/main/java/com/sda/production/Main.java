package com.sda.production;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        String[] beans = new String[] {"tools.xml", "worker.xml"};

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);

        Worker testWorker =  xmlApplicationContext.getBean(Worker.class);

        System.out.println(testWorker.getAge());
        System.out.println(testWorker.getWorkerMotto().toString());

//        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
