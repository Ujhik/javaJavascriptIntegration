import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import java.awt.image.BufferedImage;


public class ExposeObj {

    public static void main(String[] args) throws Exception{
        Globals globals = JsePlatform.standardGlobals();   
        globals.set("image", CoerceJavaToLua.coerce(
                new BufferedImage(30,40,BufferedImage.TYPE_INT_RGB)));
        LuaValue chunk = globals.load(
                "print(image:getWidth(), image:getHeight());");
        chunk.call();
    }

}