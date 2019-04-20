package com.sda.production;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        String[] beans = new String[] {"tools.xml", "worker.xml"};

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);

        Worker testWorker =  xmlApplicationContext.getBean(Worker.class);

//        System.out.println(testWorker.getAge());
//        System.out.println(testWorker.getWorkerMotto().toString());
//        System.out.println(testWorker);


        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(WorkerConfig.class);
        WorkerMotto annotationWorkerMotto = annotationApplicationContext.getBean(WorkerMotto.class);

        System.out.println(annotationWorkerMotto);
    }
}
