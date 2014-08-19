<pre>
1. Create a GitHub account.

2. Install git (from installousappstore) and set path in environment variable.

3. Install maven and set path in environment variable.

4. set proxy for maven (http://maven.apache.org/guides/mini/guide-proxies.html)
   or same can be done through <proxies> configuration in below file 
   <maven installed location>\apache-maven-3.0.4-bin\conf\settings.xml

   &lt;proxies>
    &lt;proxy>
      &lt;id>optional&lt;/id>
      &lt;active>true&lt;/active>
      &lt;protocol>http&lt;/protocol>
      &lt;username>user  &lt;/username>
      &lt;password>GGJHHJ&lt;/password>
      &lt;host>proxy&lt;/host>
      &lt;port>8080&lt;/port>
      &lt;nonProxyHosts>local.net|some.host.com&lt;/nonProxyHosts>
    &lt;/proxy>
    
  </proxies>

5. clone and run below sample program following given instruction, to test if your setup is all done.
   https://github.com/sunilkumargupta/MenuApp

6. we need to set proxy to work with our github account which I'll share offline.


</pre>
