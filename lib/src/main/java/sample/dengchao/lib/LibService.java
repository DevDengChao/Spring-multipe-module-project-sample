package sample.dengchao.lib;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:qq2325690622@gmail.com">Deng Chao</a>
 * @since 2018/7/13
 */
@Service
public class LibService {

    @NotNull
    private final LibRepository repository;

    public LibService(@NotNull LibRepository repository) {
        this.repository = repository;
        if (!repository.existsById("1")) {
            LibEntity init = new LibEntity();
            init.setId("1");
            repository.save(init);
        }
    }

    @NotNull
    public LibEntity findById() {
        return repository.getOne("1");
    }
}
