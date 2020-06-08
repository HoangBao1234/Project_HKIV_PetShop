package entity;

import entity.Pets;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-08T11:34:46")
@StaticMetamodel(Breeds.class)
public class Breeds_ { 

    public static volatile SingularAttribute<Breeds, Integer> cPId;
    public static volatile SingularAttribute<Breeds, String> name;
    public static volatile CollectionAttribute<Breeds, Pets> petsCollection;

}