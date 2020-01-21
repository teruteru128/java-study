
import java.util.*;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSSample{

  public static void main(String[] args){
    ScriptEngineManager manager = new ScriptEngineManager();
    List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
    System.out.printf("List length : %d\n", engineFactories.size());
    System.out.println("--------");
    for (ScriptEngineFactory factory : engineFactories) {
      System.out.println("Engine: " + factory.getEngineName()
          + ", Version: " + factory.getEngineVersion());
      System.out.println("Language: " + factory.getLanguageName()
          + ", Version: " + factory.getLanguageVersion());
      System.out.println("Extensions: " + factory.getExtensions());
      System.out.println("MimeTypes: " + factory.getMimeTypes());
      System.out.println("Names: " + factory.getNames());
      System.out.println("--------");
    }
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");
    System.out.println(engine);
    engine = new ScriptEngineManager().getEngineByName("js");
    try {
      System.out.println(engine.eval("var hoge = 'aaaaaaaa'; print(hoge); hoge;"));
    } catch (ScriptException e) {
      e.printStackTrace();
    }
  }
}
