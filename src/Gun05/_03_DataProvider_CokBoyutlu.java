package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokBoyutlu {
    @Test(dataProvider = "UserData")
    void UsernameTest(String username, String password) {
        System.out.println("user = " + username + " "+password);
    }

    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {

                {"HaydarCan","1222131"},
                {"Şampiyon,","Cimbom"},
                {"1905","GalataSaray"},
                {"Ayhan","Durmaz"}

        };
        return data;

    }
}
