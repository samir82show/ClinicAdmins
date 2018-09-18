package entity;

import entity.Clinic;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T20:22:47")
@StaticMetamodel(Insurance.class)
public class Insurance_ { 

    public static volatile SingularAttribute<Insurance, String> image;
    public static volatile CollectionAttribute<Insurance, Clinic> clinicCollection;
    public static volatile SingularAttribute<Insurance, String> name;
    public static volatile SingularAttribute<Insurance, Long> id;

}