package com.tcps.self;

import com.tcps.self.utils.DESUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelfApplicationTests {
    String mishi = "AKlMU89D3FchIkhKyMma6FiE";

    @Test
    public void desencode() {
        try {
            String encodeStr = "206";
            DESUtil crypt = new DESUtil(mishi);
            String reqstr = crypt.encrypt(encodeStr);
            System.err.println("Dec加密前字符串：" + encodeStr);
            System.err.println("Dec加密后字符串：" + reqstr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

//
    String toDocodeStr = "A6vOHXYSW68=";

    @Test
    public void desedode() throws Exception {
        try {
            DESUtil crypt = new DESUtil(mishi);
            String reqstr = crypt.decrypt(toDocodeStr);
            System.out.println("Dec解密前字符串：" + toDocodeStr);
            System.out.println("Dec解密后字符串：" + reqstr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
