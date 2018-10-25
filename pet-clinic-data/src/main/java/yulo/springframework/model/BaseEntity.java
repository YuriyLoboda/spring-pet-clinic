package yulo.springframework.model;

import java.io.Serializable;

/**
 * Created by yulo0717 on 10/25/2018.
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
