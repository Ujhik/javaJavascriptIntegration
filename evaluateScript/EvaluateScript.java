import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import java.awt.image.BufferedImage;


public class EvaluateScript {

    public static void main(String[] args) throws Exception{
        Globals globals = JsePlatform.standardGlobals();   
        LuaValue chunk = globals.loadfile("helloWorld.lua");
        chunk.call();
    }

}