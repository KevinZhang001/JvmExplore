package com.explore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangx on 2018/1/8.
 * <p>
 *     Repeat heap OutOfMemeoryError
 * </p>
 */
public class RepeatHeapOutOfMemoryError {
    private List<byte[]> byteLs = new ArrayList<byte[]>();
    /**
     * Create a fixed size object
     * @param size - object size; unit : MB
     */
    public void CreateByteObject(int size){
        byte[] b = new byte[1024 * 1024 * size];
        byteLs.add(b);
    }

    /**
     *  Loop create a fixed size object
     * @param size
     * @param loopNum
     */
    public void CreateByteObject(int size, int loopNum){
        int loopCounter = 0;
        while (loopCounter < loopNum){
            System.out.println("loopCounter:" + loopCounter);
            CreateByteObject(size);
            loopCounter++;

        }
    }

    public static void main(String[] args) {
        try {
            RepeatHeapOutOfMemoryError o = new RepeatHeapOutOfMemoryError();
            o.CreateByteObject(1, 50);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
