package entity;

import entity.Clinic;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T20:22:47")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile CollectionAttribute<Area, Clinic> clinicCollection;
    public static volatile SingularAttribute<Area, String> name;
    public static volatile SingularAttribute<Area, Long> id;

}