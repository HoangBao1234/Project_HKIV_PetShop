package entity;

import entity.Animals;
import entity.Breeds;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-06T19:44:33")
@StaticMetamodel(Pets.class)
public class Pets_ { 

    public static volatile SingularAttribute<Pets, Animals> cFId;
    public static volatile SingularAttribute<Pets, String> image;
    public static volatile SingularAttribute<Pets, String> pName;
    public static volatile SingularAttribute<Pets, String> color;
    public static volatile SingularAttribute<Pets, Boolean> gender;
    public static volatile SingularAttribute<Pets, Integer> price;
    public static volatile SingularAttribute<Pets, Breeds> cPId;
    public static volatile SingularAttribute<Pets, String> origin;
    public static volatile SingularAttribute<Pets, String> description;
    public static volatile SingularAttribute<Pets, String> pId;
    public static volatile SingularAttribute<Pets, String> age;

}