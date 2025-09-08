import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> map=new ConcurrentHashMap<>();

        Runnable markAttendance=()->{
            map.put(Thread.currentThread().getName(),"Present");
        };

        Thread t1=new Thread(markAttendance,"John");
        Thread t2=new Thread(markAttendance,"Arun");

        t1.start();
        t2.start();

        System.out.println(map);
    }
}
