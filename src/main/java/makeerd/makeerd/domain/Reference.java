package makeerd.makeerd.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Reference {
    @Id
    @Column(name = "reference_id")
    private Long id;

    private String referenceUrl;

    private String referenceExplain;
}
