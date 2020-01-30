package com.twitter.teruteru128.study.ec.sample001;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Pattern;

import org.bouncycastle.jce.ECNamedCurveTable;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Provider provider = Security.getProvider("BC");
		if(provider == null){
			Class<?> class1 = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
			Constructor<?> constructor = class1.getConstructor();
			Object o = constructor.newInstance();
			if(o instanceof Provider){
				//Security.addProvider(provider = (Provider)o);
			}
		}
		Pattern pattern = Pattern.compile("256|5[27]1");
		Class<?> class2 = Class.forName("org.bouncycastle.jce.ECNamedCurveTable");
		Method method = class2.getMethod("getNames");
		Object object1 = method.invoke(null);
		Enumeration<?> names = ECNamedCurveTable.getNames();
		ArrayList<String> namesList = new ArrayList<>();
		while (names.hasMoreElements()) {
			Object object2 = (Object) names.nextElement();
			if (object2 instanceof String) {
				String name = (String) object2;
				if (pattern.matcher(name).find()) {
					System.out.println(name);
				}
				namesList.add(name);
			}
		}
		System.out.println("--");
		namesList.forEach(System.out::println);
	}

}
