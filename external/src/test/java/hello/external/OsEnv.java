package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {
    public static void main(String[] args) {
//        Map<String, String> envMap = System.getenv();
//        for (Map.Entry<String, String> entry : envMap.entrySet()) {
//            log.info("env {} = {}", entry.getKey(), entry.getValue());
//        }

        // DBURL = dev.db.com -> 개발 서버
        // DBURL = prod.db.com -> 운영 서버
        // String dburl = System.getenv("DBURL");

        String javaHome = System.getenv("JAVA_HOME");
        log.info(javaHome);
    }
}
