package com.company;

public class My_Window {
    private String Size;
    private String Stuff;
    private int Pure;
    private boolean Opened;

    My_Window(){
        Pure=100;
        Size="200,100 см.";
        Stuff="Дерево";
        Opened=false;
    }

    public void Show(){
        System.out.println("Розмір: " + Size);
        System.out.println("Матеріал: "+ Stuff);
        System.out.println("Чистота: "+ Integer.toString(Pure));
        if (Opened)
        System.out.println("Вікно відчинено");
        else System.out.println("Вікно зачинено");
    }

    public void Open_or_Close(){
    if (Opened)
        {Opened=false;
        System.out.println("Вікно зачинено");}
    else {Opened=true;
        System.out.println("Вікно відчинено");}
    }

    public void Wash(){
        Pure = 100;
        System.out.println("Вікно помите");
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getStuff() {
        return Stuff;
    }

    public void setStuff(String stuff) {
        Stuff = stuff;
    }

    public int getPure() {
        return Pure;
    }

    public void setPure(int pure) {
        Pure = pure;
    }

    public boolean isOpened() {
        return Opened;
    }

    public void setOpened(boolean opened) {
        Opened = opened;
    }
}
