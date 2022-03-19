package com.kjq;

public class Test3 {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        T1 t1 = new T1(counter1);
        t1.jie();
        t1.huan();
        t1.mai();
        t1.tao();
        System.out.println("========================");
        Counter counter2 = new Counter(10);
        T2 t2 = new T2(counter2);
        t2.jie();
        t2.huan();
        t2.mai();
        t2.tao();
    }
}

class Counter {
    private int counterValue;

    public Counter(int counterValue) {
        this.counterValue = counterValue;
    }

    public void increment(){
        counterValue ++;
    }

    public void decrement(){
        counterValue--;
    }

    public void reset(){
        counterValue = 0;
    }

    public int getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }
}

abstract class T {
    public Counter counter;

    public T(Counter counter) {
        this.counter = counter;
    }

    abstract public void jie();
    abstract public void mai();
    abstract public void huan();
    abstract public void tao();

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }
}

class T1 extends T{

    public T1(Counter counter) {
        super(counter);
    }

    @Override
    public void jie() {
        counter.decrement();
        System.out.println("借出一个篮球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void mai() {
        counter.increment();
        System.out.println("买一个篮球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void huan() {
        counter.increment();
        System.out.println("归还一个篮球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void tao() {
        counter.decrement();
        System.out.println("淘汰一个篮球，还剩：" + counter.getCounterValue());
    }
}

class T2 extends T{
    public T2(Counter counter) {
        super(counter);
    }

    @Override
    public void jie() {
        counter.decrement();
        System.out.println("借出一个足球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void mai() {
        counter.increment();
        System.out.println("买一个足球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void huan() {
        counter.increment();
        System.out.println("归还一个足球，还剩：" + counter.getCounterValue());
    }

    @Override
    public void tao() {
        counter.decrement();
        System.out.println("淘汰一个足球，还剩：" + counter.getCounterValue());
    }
}
