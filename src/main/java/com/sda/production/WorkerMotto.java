package com.sda.production;

public class WorkerMotto
{
    String motto;

    public WorkerMotto(String motto)
    {
        this.motto = motto;
    }

    @Override
    public String toString()
    {
        return "WorkerMotto{" +
                "motto='" + motto + '\'' +
                '}';
    }
}
