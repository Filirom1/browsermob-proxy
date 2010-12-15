A JAVA librairie for Har ( HTTP Archive Specification )
======================================================
For Har (HTTP Archive Specification) see the google group 
http://groups.google.com/group/http-archive-specification/


Usage
-----
Har har = HarParser.parseHarFromFile(new File(fileName));

HarLog harLog = har.getLog();

String harBrowser = harLog.getBrowser().getName();


