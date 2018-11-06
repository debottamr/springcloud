package spring1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.Resource;

public class CustomResourceLoaderIn {
		 
	    private Resource resource;
	 
	    public Resource getResource() {
	        return resource;
	    }
	 
	    public void setResource(Resource resource) {
	        this.resource = resource;
	    }
	    
	    public void showResourceData() throws IOException
	    {
	        
	        InputStream in = resource.getInputStream();
	 
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	 
	        while (true) {
	            String line = reader.readLine();
	            if (line == null)
	                break;
	            System.out.println(line);
	        }
	        reader.close();
	    }
	
}
