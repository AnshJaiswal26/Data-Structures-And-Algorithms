package Java_Concepts.Multithreading.A4Locks;

class Pen{

    public synchronized void writingWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen "+ this + " and trying to use paper");
        paper.finishedWriting();
    }

    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing");
    }
}

class Paper{

    public synchronized void writingWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using paper "+ this + " and trying to use pen");
        pen.finishedWriting();
    }

    public synchronized void finishedWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing");
    }
}

class task1 implements Runnable{
    private final Pen pen;
    private final Paper paper;

    task1(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run(){
        synchronized (paper){
            pen.writingWithPenAndPaper(paper);// t1 has pen and trying to use paper
        }
    }
}

class task2 implements Runnable{
    private final Pen pen;
    private final Paper paper;

    task2(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run(){
        paper.writingWithPaperAndPen(pen);// t2 has paper and trying to use pen
    }
}

public class PenPaper {
    public static void main(String args[]){
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new task1(pen,paper),"t1");
        Thread t2 = new Thread(new task2(pen,paper),"t2");

        System.out.println(pen); // locked on memory location
        System.out.println(paper); // locked on memory location

        t1.start();
        t2.start();

    }
}
