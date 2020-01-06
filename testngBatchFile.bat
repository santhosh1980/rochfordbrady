set projectLocation=C:\Users\U35035\eclipse-workspace\myrbtest
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause