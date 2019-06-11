package ua.lviv.lgs;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Application {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<MyClass> myClass = MyClass.class;
		

		System.out.println("Name of class => "+myClass.getName());
		System.out.println("Simple name of class => "+myClass.getSimpleName());
		
		System.out.println();
		
		int modefiter = myClass.getModifiers();
		String modefiterText = Modifier.toString(modefiter);
		System.out.println("Class modifier => " + modefiter + " ModefiterText => " + modefiterText);
		System.out.println("  is static => " +Modifier.isStatic(modefiter));
		System.out.println("  is public => " +Modifier.isPublic(modefiter));
		System.out.println("  is private => " +Modifier.isPrivate(modefiter));
		System.out.println();
		
		System.out.println("Package of current class => "+myClass.getPackage());
		System.out.println("Super class => "+myClass.getSuperclass());
		System.out.println("GetClass => " + myClass.getClass());
		
		System.out.println();
		
		Class[] interfaces = myClass.getInterfaces();
		System.out.println("Interfaces => " + Arrays.toString(interfaces));
		
		System.out.println();
		
		Constructor<?>[] constructors = myClass.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println("Constructor " + i + " => "+constructor);
			
		}
		

		System.out.println();
		Field[] fields = myClass.getFields();
		System.out.println("Class fields:");
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Field = "+field);
		}
		
		
		System.out.println();
		fields=myClass.getDeclaredFields();
		System.out.println("Class "+ myClass.getSimpleName()+" has fields:");
		for(Field field:fields) {
		System.out.println("Field "+field );
	 }
		
		Method[] methods= myClass.getMethods();
		 System.out.println("Class methods:");
		 for (Method method : methods) {
			System.out.println("Method "+ method);
		}
		 System.out.println("Amount of methods "+ methods.length);
			System.out.println();
		


	}

}
