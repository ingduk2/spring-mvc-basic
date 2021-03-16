package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        //debug 인 경우에 + 로 하면 immutable 때문에 연산 일어나면서 쓸모없는 리소스 사용하게 됨.
        log.trace("trace log=" + name);
        log.trace("trace log={}",name);

        log.debug("debug log={}",name);
        log.info("info log={}" , name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "OK";
    }
}
