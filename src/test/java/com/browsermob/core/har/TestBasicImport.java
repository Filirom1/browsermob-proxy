package com.browsermob.core.har;

import java.io.File;



import org.junit.*;
import static org.junit.Assert.*;

/** Test the basic importing of HAR as json.  No attempt at completeness is made here. */
public class TestBasicImport {

    @Test
    public void browser() {
        String fileName = this.getClass().getResource("/ysearch.har").getFile();
        try {
            Har har = HarParser.parseHarFromFile(new File(fileName));
            HarLog ysearch = har.getLog();
            String harBrowser = ysearch.getBrowser().getName();
            assertEquals("browser name", "Firefox", harBrowser);
        } catch (Exception ex) {
            fail("Exception occurs "+ex.getMessage());
        }
    }

    @Test
    public void expiresNaNInCookies() {
        String fileName = this.getClass().getResource("/expires_NaN.har").getFile();
        try {
            Har har = HarParser.parseHarFromFile(new File(fileName));
        } catch (Exception ex) {
            fail("Exception occurs "+ex.getMessage());
        }
    }
}
