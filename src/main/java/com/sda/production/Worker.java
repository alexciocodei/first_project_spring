package com.sda.production;

public class Worker
{
    int age;
    String profession;
    WorkerMotto workerMotto;

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
