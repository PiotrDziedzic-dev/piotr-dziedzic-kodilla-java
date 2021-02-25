package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private final String surname;
    private int updateCount;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name+" "+surname+": New message in topic "+taskQueue.getName()+"\n"+
        " (total: "+taskQueue.getTasks().size()+" tasks");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
