//多線程中無法控制線程的執行時間，因此需要進行線程管理
//此處用信號量進行管理，來控制先後順序

class FooBar {
    private int n;
    Semaphore semaphoreFoo = new Semaphore(1); //最大同時運行許可證為1
    Semaphore semaphoreBar = new Semaphore(0); //最大同時運行許可證為0

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semaphoreFoo.acquire(); //因為擁有一個運行權限，semaphoreFoo能獲取資源運行
                                    //Bar獲得資源時，Foo的線程沒有資源可運行，被掛起，等待Bar結束釋放Foo資源
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            semaphoreBar.release(); //不能釋放自己的資源，不然semaphoreFoo可能會繼續打印
                                    //釋放semaphoreBar的資源
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semaphoreBar.acquire();//沒有資源可運行，線程被掛起
                                   //semaphoreFoo結束後釋放Bar的資源，Bar可獲得資源
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            semaphoreFoo.release();
        }
    }
}
