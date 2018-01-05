import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import java.awt.image.BufferedImage;


public class helloWorld {

    public static void main(String[] args) throws Exception{
        Globals globals = JsePlatform.standardGlobals();   
        LuaValue chunk = globals.load(
                "print('Hello World');");
        chunk.call();
    }

}