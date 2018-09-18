package entity;

import entity.Clinic;
import entity.Groupauth;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T20:22:47")
@StaticMetamodel(Userauth.class)
public class Userauth_ { 

    public static volatile SingularAttribute<Userauth, String> password;
    public static volatile SingularAttribute<Userauth, Clinic> clinicId;
    public static volatile SingularAttribute<Userauth, Long> id;
    public static volatile CollectionAttribute<Userauth, Groupauth> groupauthCollection;
    public static volatile SingularAttribute<Userauth, String> email;
    public static volatile SingularAttribute<Userauth, String> username;

}