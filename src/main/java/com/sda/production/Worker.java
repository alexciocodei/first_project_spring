package com.sda.production;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker
{
    int age;
    String profession;
    @Autowired WorkerMotto workerMotto;
    private List<Tool> tools;

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
