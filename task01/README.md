<pre>
1. Create a GitHub account.

2. Install GitHub Client and set path in environment variable.

3. Install maven and set path in environment variable.

4. clone and run below sample program following given instruction, to test if your setup is all done.
   https://github.com/sunilkumargupta/MenuApp

5. we need to set proxy to work with our github account which I'll share offline.

6. Git commands:

1) Make the original repository upstream remote for your local

cd github\sunil
git clone https://github.com/<user>/springhibernatesession
(<user> is your account)
cd springhibernatesession

 ___________________________________________________________________________________________ 
|	One time setting:                                                                       |
|	cd springhibernatesession                                                               |
|	git remote add upstream https://github.com/sunilkumargupta/springhibernatesession       |
|___________________________________________________________________________________________|

To get updates from the source repository of sunilkumargupta
git fetch upstream
git merge upstream/master master
git push

</pre>
