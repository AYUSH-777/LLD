package org.lld;

public class Cube implements Area,Volume{
    private int len;
    public Cube(int len)
    {
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public void getArea()
    {
        int area = 6*len*len;
        System.out.println("Area : "+area);
    }

    @Override
    public void getVolume()
    {
        int volume = len*len*len;
        System.out.println("Volume : "+volume);
    }
}
