package spring1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
 
public class CustomResourceLoader implements ResourceLoaderAware
{
 
    private ResourceLoader resourceLoader;
 
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
 
    public void showResourceData() throws IOException
    {
        //This line will be changed for all versions of other examples
        Resource banner = resourceLoader.getResource("classpath:/filesystemdata.txt");
        //Resource banner = resourceLoader.getResource("file:c:/temp/filesystemdata.txt"); 
        //To load file from application folder, use below template: Resource banner = resourceLoader.getResource("file:data.txt");


        InputStream in = banner.getInputStream();
 
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