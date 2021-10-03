package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
       if (imf == null)
        synchronized (IMF.class){
            if (imf == null)
            imf = new IMF();
        }//add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}
