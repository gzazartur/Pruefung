import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {  
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("reflection.Tuer");            
            Object obj = cl.newInstance();                
            // doIt() with single int parameter
            Method method = cl.getDeclaredMethod("doIt", new Class[]{int.class});          
            method.invoke(obj, new Object[] { new Integer(3)});          
            // call same method for another object
            method.invoke(new Tuer(), new Object[] { new Integer(6)});       
        } catch(ClassNotFoundException ex) {  
        } catch(InstantiationException ex) { 
        } catch(NoSuchMethodException ex) {  
        } catch(InvocationTargetException ex) {        
        } catch(IllegalAccessException ex) { 
        }
    }
}