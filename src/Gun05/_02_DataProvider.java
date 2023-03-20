package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {
    @Test(dataProvider = "datalarim")
    void Username(String useradi){
        System.out.println("useradi =>"+useradi);
    }
    @DataProvider// bu ethoda dataprovider görevi verildi
    public Object[] datalarim()// DataProvider olarak kullanılıcak methodun tipi Object olmak zorunda
    {
        Object[] userler={"Haydar","Bekir","İbrahim","ismet"};

        return userler;
    }
    /************************/
    @Test(dataProvider = "datalarim")
    void Username(int id){
        System.out.println("useradi =>"+id);
    }
    @DataProvider// bu ethoda dataprovider görevi verildi
    public Object[] datalarim1()// DataProvider olarak kullanılıcak methodun tipi Object olmak zorunda
    {
        Object[] userler={1,2,3,4};

        return userler;
    }
}
