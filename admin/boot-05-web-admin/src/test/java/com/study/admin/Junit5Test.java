package com.study.admin;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Repeat;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author RenAshbell
 * @create 2022-05-31-16:29
 */
//@SpringBootTest
@DisplayName("junit5功能测试类")
public class Junit5Test {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ParameterizedTest
    @DisplayName("参数化测试")
    @MethodSource("stringProvider")
    void testParameterized2(String i){
        System.out.println(i);
    }

    static Stream<String> stringProvider(){
        return Stream.of("apple","banana","ashbell");
    }


    @ParameterizedTest
    @DisplayName("参数化测试")
    @ValueSource(ints = {1,2,3,4,5})
    void testParameterized(int i){
        System.out.println(i);
    }

    @Test
    @DisplayName("测试前置条件")
    void testAssumptions(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("11111111");
    }

    @Test
    @DisplayName("测试简单断言")
    void testSimpleAssertion(){
        int cal = cal(2, 3);
        // 相等
        assertEquals(5,cal,"业务逻辑计算失败");
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertSame(obj1,obj2,"两个对象不一样");
    }

    int cal(int i,int j){
        return i+j;
    }

    @Test
    @DisplayName("组合断言")
    void all(){
        /**
         * 所有断言都要成功
         */
        assertAll("test",
                ()-> assertTrue(true && true,"结果不为true"),
                ()-> assertEquals(1,2,"结果不相等"));
        System.out.println("===========");
    }

    @Test
    @DisplayName("异常断言")
    void testException(){
        // 断定业务逻辑一定出现异常
        assertThrows(ArithmeticException.class,()-> {
            int i = 10 / 1;
        },"业务逻辑没出错？？？");
    }

    @Test
    @DisplayName("快速失败")
    void TestFail(){
        if (1 == 1){
            fail("测试失败");
        }
    }


    @Test
    @DisplayName("测试displayname注解")
    void testDisplayName(){
        System.out.println(1);
        System.out.println(jdbcTemplate);
    }

    @Test
    @DisplayName("测试方法2")
    void test2(){
        System.out.println(2);
    }

    @RepeatedTest(5)
    @Test
    void test3(){
        System.out.println(5);
    }

    /**
     * 规定方法超出时间则抛出异常
     * @throws InterruptedException
     */
    @Test
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    void testTimeout() throws InterruptedException {
        Thread.sleep(600);
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("测试就要开始了...");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("测试结束了...");
    }

    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试就要开始了...");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试结束了...");
    }
}
