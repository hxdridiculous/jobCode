package com.itheima.test_9;

import java.util.HashSet;
import java.util.Random;

/***
 * 十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。
 * （要求同色号码不重复）(HashSet)
 */
public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        io:while (true) {
            if (set.size()<5){
                int a=random.nextInt(33) + 1;
                set.add(a);
            }else {
                if (set.size()==6){
                    break io;
                }else  if(set.size()<6){
                    int b=random.nextInt(16) + 1;
                    set.add(b);
                }
            }

        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
