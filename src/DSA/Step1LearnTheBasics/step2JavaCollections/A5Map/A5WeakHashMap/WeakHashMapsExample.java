package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A5WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapsExample {
    public static void main(String[] args){
        // All the methods and working is same as HashMap
        WeakHashMap<String, Image> mpp = new WeakHashMap<>(); // used to store temporary data or pairs

        // here there is no strong reference of objects so JVM clears WeakHashMap pairs
        mpp.put(new String("img1"),new Image("Image1"));
        mpp.put(new String("img2"),new Image("Image2"));
        System.out.println("Current Cache - "+mpp);

        System.out.println("Running Application......");
        System.gc();
        SimulatingApplication();
        System.out.println("Cache After Running Application - "+mpp);
    }
    public static void SimulatingApplication(){
        try {
            Thread.sleep(10000);
        }catch (Exception e){
        }
    }
}

class Image{
    private String name;

    Image(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}