package sample.dengchao.lib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="mailto:qq2325690622@gmail.com">Deng Chao</a>
 * @since 2018/7/13
 */
@Table
@Entity
public class LibEntity {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
