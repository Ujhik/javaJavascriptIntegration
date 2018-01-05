import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import java.awt.image.BufferedImage;

class CustomClass{

	public void cuscomMethod(){
		System.out.println("WORKING!!");
	}
}

public class ExposeCustomObject {

    public static void main(String[] args) throws Exception{
        Globals globals = JsePlatform.standardGlobals();   
        globals.set("image", CoerceJavaToLua.coerce(
                new CustomClass()));
        LuaValue chunk = globals.load(
                "image:cuscomMethod();");
        chunk.call();
    }

}