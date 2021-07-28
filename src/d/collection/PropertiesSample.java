package d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args){
        PropertiesSample sample = new PropertiesSample();
//        sample.checkProperties();
//        sample.saveAndLoadProperties();
        sample.saveAndLoadPropertiesXML();
    }
    public void checkProperties(){
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject : keySet){
            System.out.println(tempObject + "=" + prop.get(tempObject));
        }
    }
    public void saveAndLoadProperties(){
        try{
            String fileName = "test.properties";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "tysong");
            prop.setProperty("WriterHome", "http://tysong.com");
            prop.store(fos, "java practice Properties file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void saveAndLoadPropertiesXML(){
        try{
            String fileName = "test.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "tysong");
            prop.setProperty("WriterHome", "http://tysong.com");
            prop.storeToXML(fos, "java practice Properties file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            fis.close();
            System.out.println(propLoaded);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
