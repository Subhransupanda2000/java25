package org.example.file;
import java.io.*;
public class Marker implements Serializable {
    private String color;
    private int price;
    private String brand;
    public Marker(String color, int price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display()
    {
        System.out.println(this.getBrand());
        System.out.println(this.getColor());
        System.out.println(this.getPrice());
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Marker m = new Marker("red", 234, "hjk");
        FileOutputStream fos = new FileOutputStream("mno.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(m);
        oos.flush();
        System.out.println("Data stored");
        FileInputStream fis=new FileInputStream("mno.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Marker marker =(Marker)ois.readObject();
        marker.display();
    }
}
