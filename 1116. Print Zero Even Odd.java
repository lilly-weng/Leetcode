class ZeroEvenOdd {
    private int n;
    Semaphore s1 = new Semaphore(1); //先從零開始釋放資源
    Semaphore s2 = new Semaphore(0); //其他人先沒有權限
    Semaphore s3 = new Semaphore(0); //其他人先沒有權限
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i=1; i<=n; i++) {
            s1.acquire(); //獲取資源
            printNumber.accept(0); //打印出"0"
            if (i%2 == 0 ) { 
                s2.release(); //如果是even就把通行證給s2
            } else {
                s3.release(); //如果是odd就把通行證給s3
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i=2; i<=n; i+=2) {
            s2.acquire();
            printNumber.accept(i);
            s1.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i=1; i<=n; i+=2) {
            s3.acquire();
            printNumber.accept(i);
            s1.release();
        }
        
    }
}
