package org.lld;

public class Singleton {
//    private static Singleton obj = null;
//
//    private Singleton()
//    {
//
//    }
//
//    public static Singleton getInstance()
//    {
//        if(obj==null)
//        {
//            synchronized (Singleton.class)
//            {
//                if(obj==null)
//                {
//                    obj = new Singleton();
//                }
//            }
//        }
//        return obj;
//    }

    private static Singleton obj = null;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(obj==null)
        {
            synchronized (Singleton.class)
            {
                if (obj==null)
                {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }

    public void print()
    {
        System.out.println("Singleton Design Pattern");
    }

}
