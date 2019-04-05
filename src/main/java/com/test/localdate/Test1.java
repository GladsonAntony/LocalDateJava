package com.test.localdate;

import org.testng.annotations.Test;

import java.time.LocalDate;

public class Test1
{

    @Test
    public void test1() throws Exception
    {
        LocalDate localDate5= LocalDate.parse("2019-03-31");
        System.out.println(localDate5.plusMonths(11));

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
    }
}
