import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		URL urlProcessing = null;
	    try {
	    	urlProcessing = new URL(new URL("file:"), ".\\test1.jar");
	    }catch (MalformedURLException e) {
	        System.out.println("Invalid URL: " + args[0]);
	        System.exit(1);
	    }
	    loadAndRun(urlProcessing); 
	    
	}
	
   private static void loadAndRun(URL url){
	   JarClassLoader cl = new JarClassLoader(url);
	    String name = null;
	    try {
	      name = cl.getMainClassName();
	      System.out.println("name of Class in JarFile: "+name);
	    } catch (IOException e) {
	      System.err.println("I/O error while loading JAR file:");
	      e.printStackTrace();
	      //System.exit(1);
	    }
	    if (name == null) {
	    	System.out.println("Specified jar file does not contain a 'Main-Class'"
	          + " manifest attribute");
	    }
	    String[] newArgs = new String[0];
	    try {
		      cl.invokeClass(name, newArgs);
		    } catch (ClassNotFoundException e) {
		      System.err.println("Class not found: " + name);
		    } catch (NoSuchMethodException e) {
		    	System.err.println("Class does not define a 'main' method: " + name);
		    } catch (InvocationTargetException e) {
		        e.getTargetException().printStackTrace();
		        System.exit(1);
		    }
	    try {
			cl.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
}
