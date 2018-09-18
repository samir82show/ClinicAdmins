package entity;

import entity.Area;
import entity.Insurance;
import entity.Userauth;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-18T20:22:47")
@StaticMetamodel(Clinic.class)
public class Clinic_ { 

    public static volatile SingularAttribute<Clinic, String> image;
    public static volatile CollectionAttribute<Clinic, Insurance> insuranceCollection;
    public static volatile SingularAttribute<Clinic, Area> areaId;
    public static volatile CollectionAttribute<Clinic, Userauth> userauthCollection;
    public static volatile SingularAttribute<Clinic, String> name;
    public static volatile SingularAttribute<Clinic, String> phones;
    public static volatile SingularAttribute<Clinic, Long> id;

}