package Gun02;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _01_Enable {
    @Test
    public void Test1(){
        System.out.println("test 1");
    }
    @Test(enabled = false)
    public void Test2(){
        System.out.println("test 2");
    }
    @Test
    public void Test3(){
        System.out.println("test 3");
    }

    @BeforeClass
    void baslagicIslemleri()
    {
        System.out.println("başlangıç işlemleri yaplıyor");
    }

    @AfterClass
    void bitisIslemleri()
    {
        System.out.println("bitiş işlemleri yaplıyor");
    }


}
