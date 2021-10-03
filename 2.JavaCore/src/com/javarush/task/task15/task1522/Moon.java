package com.javarush.task.task15.task1522;

public class Moon implements Planet{
    private static Moon instance;
    private Moon(){}
    public static Moon getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Moon();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
