package guru.springframework.gurupetclinic.model;

import java.io.Serializable;

/**
 * @author Herman Kulik
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
