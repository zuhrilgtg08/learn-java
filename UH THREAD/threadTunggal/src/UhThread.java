class CobaThread2 extends Thread {
    @Override
    public void run()
    {
        int i = 1;
        while(i <= 10){
            System.out.println("Thread 2 " + i);
            i++;
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException err) {
            err.getStackTrace();
        }
    }
}