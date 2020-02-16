package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack {

    static int DEFAULT_DEPTH = 100;
    long stackDepth;

    public TddStack() {}

    TddStack(long stackDepth) {}

    //to compile, this method must return something, but this
    //code is just to make it compile, not a real implementation
    boolean isEmpty(){
        return false;
    }

    boolean isFull() { return false; }

    IStackable pop() {
        //any object can be null; again, just to get it to compile
        return null;
    }

    void push(IStackable iStackable) {
        //doesn't need to return anything
    }


}
