package bck;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_perms")
public class PermissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String uid;

    @Getter @Setter
    private String branches;

    public PermissionModel(){}

    public PermissionModel(String uid, String branches){

    }
}

