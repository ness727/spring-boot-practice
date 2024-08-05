package hello.my.container;

import hello.my.servlet.MyTestServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class MyAppInitImpl implements MyAppInit {
    @Override
    public void onStartup(ServletContext servletContext) {
        ServletRegistration.Dynamic servlet = servletContext.addServlet("MyTestServlet", MyTestServlet.class);
        servlet.addMapping("/my/*");
    }
}
