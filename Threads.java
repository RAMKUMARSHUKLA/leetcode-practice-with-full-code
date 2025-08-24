public class Threads {
    public static void main(String[] args) {
        new Thread1().start();
        Thread th=new Thread(new Thread2());
        th.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread running");
    }
}

class Thread2 implements Runnable{
    public void run(){
        System.out.println("Runable");
    }
}
