package entity;

import entity.Userauth;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T20:22:47")
@StaticMetamodel(Groupauth.class)
public class Groupauth_ { 

    public static volatile CollectionAttribute<Groupauth, Userauth> userauthCollection;
    public static volatile SingularAttribute<Groupauth, Long> id;
    public static volatile SingularAttribute<Groupauth, String> groupname;

}