A JAVA librairie for Har ( HTTP Archive Specification )
======================================================
For Har (HTTP Archive Specification) see the google group 
http://groups.google.com/group/http-archive-specification/


Usage
-----
Har har = HarParser.parseHarFromFile(new File(fileName));

HarLog harLog = har.getLog();

String harBrowser = harLog.getBrowser().getName();


Maven repository
----------------
Add the following lines in your pom.xml

    <dependencies>
        ....
        <dependency>
            <groupId>com.browsermob</groupId>
            <artifactId>har</artifactId>
            <version>1.1.0</version>
        </dependency>
        ....
    </dependencies>

    <repositories>
        <repository>
            <id>filirom1-repo</id>
            <url>https://Filirom1@github.com/Filirom1/filirom1-mvn-repo/raw/master/releases</url>
        </repository>
    </repositories>
