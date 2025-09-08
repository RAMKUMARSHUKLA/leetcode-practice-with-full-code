public class VolatileKeyword {
        volatile boolean isflag=true;

        void write(){
            isflag=false;
        }

        void read(){
            while (isflag){

            }
            System.out.println("false");
        }

    public static void main(String[] args) {
        VolatileKeyword keyword=new VolatileKeyword();
        Thread t1=new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            keyword.write();
        });
        Thread t2=new Thread(()->{
            keyword.read();
        });

        t1.start();
        t2.start();
        System.out.println(keyword.isflag);
    }
}
