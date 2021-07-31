public class SingleThread extends Thread{
    private int[] temp;
    long starts = System.currentTimeMillis ();
    public SingleThread(String threadname){

        super(threadname);
        temp = new int[10];

        for(int start=0;start<temp.length;start++){
            temp[start]=start;
        }
    }

    public void run(){
        for(int start:temp){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
                // TODO: handle exception
            }
            System.out.println("스레드이름:"+currentThread().getName());
            System.out.println("temp value :"+start);
        }
        long end = System.currentTimeMillis ();
        System.out.println ( "실행 시간 : " + (end - starts) / 1000.0 );
    }

    public static void main(String[] args) {
        SingleThread st = new SingleThread("첫번째");
        st.start();
    }

}
