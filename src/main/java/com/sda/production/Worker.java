package com.sda.production;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker
{
    int age;
    String profession;
    @Autowired
    WorkerMotto workerMotto;
    private List<Tool> tools;
    public static final Log LOGGER = LogFactory.getLog(Worker.class);

    public void initialize() throws Exception
    {
//        System.out.println("Worker.initialize");
        LOGGER.info("Worker.initialize");
    }

    public void destroy() throws Exception
    {
//        System.out.println("Worker.destroy");
        LOGGER.info("Worker.destroy");
    }


    public List<Tool> getTools()
    {
        return tools;
    }

    public void setTools(List<Tool> tools)
    {
        this.tools = tools;
    }

    @Override
    public String toString()
    {
        return "Worker{" +
                "age=" + age +
                ", profession='" + profession + '\'' +
                ", workerMotto=" + workerMotto +
                ", tools=" + tools +
                '}';
    }

    public Worker(int age, String profession, WorkerMotto workerMotto)
    {
        this.age = age;
        this.profession = profession;
        this.workerMotto = workerMotto;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    public WorkerMotto getWorkerMotto()
    {
        return workerMotto;
    }

    public void setWorkerMotto(WorkerMotto workerMotto)
    {
        this.workerMotto = workerMotto;
    }
}
