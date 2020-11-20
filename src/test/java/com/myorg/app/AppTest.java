package com.myorg.app;

import java.io.CharArrayWriter;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String script = "Failed to execute script: \n" +
            "              Insight.registerViewDetailsListener(IDEA_viewDetails);\n" +
            "\n" +
            "              Insight.registerMarkUpgradeListener(IDEA_migrate);\n" +
            "\n" +
            "              if (typeof Insight.setCapabilities === 'function') {\n" +
            "                Insight.setCapabilities({viewDetails: true, migrate: true});\n" +
            "              }\n" +
            "\n" +
            "              Insight.setHeaders({ \"Authorization\" : \"Basic   CREDENTIALS_LEAKED_HERE\",\"User-Agent\":\"Nexus_IQ_IDEA/2.7.0-05 (Java 11.0.5; Windows 7 6.1; IDEA IU-193.6494.35)\",\"X-CLM-Client-User-Agent\":\"Nexus_IQ_IDEA/2.7.0-05 (Java 11.0.5; Windows 7 6.1; IDEA IU-193.6494.35)\"});\n" +
            "             ";

        String s = script.replaceAll(
            "\"Authorization\"[\\s]*:[\\s]*\"Basic [^\"]+\"", "\"Authorization\":\"Basic ****\"");
        assertEquals(script, s);
    }

    public void test() {
        String result = reverse("hello");
        System.out.println(result);
    }

    public String reverse(final String input) {
        CharArrayWriter writer = new CharArrayWriter();
        char[] chars = input.toCharArray();
        int length =  chars.length;
        for (int i = length - 1; i > -1; i--) {
            char c = chars[i];
            if (i % 2 == 0) {
                c = Character.toUpperCase(c);
            }
            writer.append(c);
        }
        return writer.toString();
    }

    public void test2() {
        char[] array = new char[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('a' + i);
        }
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            System.out.println(c);
        }

            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                char c = (char) ('a' + i);
                map.put(c, c);
            }
            for (char c : map.values()) {
                System.out.println(c);
            }



    }
}
