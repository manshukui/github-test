package com.baizhi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GithubTests {

    @Test
    public void test() {
        System.out.println("你好，请多指教");
    }

    @Test
    public void test2() {
        int a = 10;
        System.out.println(a+10);
        System.out.println("======");
    }

}
