package hello.my;

import hello.my.container.MyAppInit;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@HandlesTypes(MyAppInit.class)
public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyServletContainerInit.onStartup");

        for (Class<?> s : set) {
            try {
                MyAppInit myAppInit = (MyAppInit) s.getDeclaredConstructor().newInstance();
                myAppInit.onStartup(servletContext);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
