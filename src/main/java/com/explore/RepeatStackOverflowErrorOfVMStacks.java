package com.explore;

/**
 * Created by zhangx on 2018/1/8.
 * <p>
 *     Repeat StackOverflowError of JVM Stacks
 * </p>
 */
public class RepeatStackOverflowErrorOfVMStacks {
    private long operand = 1;

    private void InfiniteOperand(){
        operand++;
        InfiniteOperand();
    }

    public void ShowStackCallDepth(){
        try {
            InfiniteOperand();
        }catch (Throwable e){
            System.out.println("Stack Call Deptrh:" + operand);
            e.printStackTrace();
        }
    }
}
