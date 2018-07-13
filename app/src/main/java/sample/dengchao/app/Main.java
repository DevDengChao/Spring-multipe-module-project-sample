package sample.dengchao.app;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.dengchao.lib.LibService;

import javax.annotation.PostConstruct;

/**
 * @author <a href="mailto:qq2325690622@gmail.com">Deng Chao</a>
 * @since 2018/7/13
 */
@SpringBootApplication(scanBasePackages = "sample.dengchao.lib")
public class Main {

    @NotNull
    private final LibService service;

    public Main(@NotNull LibService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostConstruct
    public void postConstruct() {
        assert service.findById().getId().equals("1");
    }
}
