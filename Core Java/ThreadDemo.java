class MyThread extends Thread {

    String msg;

    MyThread(String msg){

        this.msg = msg;

    }

    public void run() {

        for(int i=1;i<=5;i++)
            System.out.println(msg);

    }
}

class ThreadDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread One");
        MyThread t2 = new MyThread("Thread Two");

        t1.start();
        t2.start();

    }
}