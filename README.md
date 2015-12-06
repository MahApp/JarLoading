####JarLoading MCVE
Outlining loading processing jarfiles problem, this code **works with jar-files in general** but not with sketches from processing packed as a jar-file.

####The Processing sketch Test1 as an Eclipse project
[This](https://github.com/MahApp/JarLoading/blob/master/Test1/src/se/mah/Processing1.java) file is the output file exported from processing.
core.jar.

####The JarRunnerSimple Java program
This project contains the files that loads the jar-file Test1.jar that is Test1 packed as a jarfile. This is exportes from eclipse with core.jar unpacked. The file [MainClass](https://github.com/MahApp/JarLoading/blob/master/JarRunnerSimple/src/MainClass.java) and the file [JarClassLoader](https://github.com/MahApp/JarLoading/blob/master/JarRunnerSimple/src/JarClassLoader.java) is more or less directly from [Oracle examples](http://docs.oracle.com/javase/tutorial/deployment/jar/examples/JarClassLoader.java).

In this example Test1.jar is loaded from a local directory but I still get a ClassNotFoundException. 

