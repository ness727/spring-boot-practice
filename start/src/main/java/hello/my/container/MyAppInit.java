package hello.my.container;

import jakarta.servlet.ServletContext;

public interface MyAppInit {
    void onStartup(ServletContext servletContext);
}
