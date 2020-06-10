package entity;

import entity.Accessories;
import entity.Foods;
import entity.Pets;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-10T17:58:33")
@StaticMetamodel(Animals.class)
public class Animals_ { 

    public static volatile SingularAttribute<Animals, Integer> cFId;
    public static volatile SingularAttribute<Animals, String> name;
    public static volatile CollectionAttribute<Animals, Foods> foodsCollection;
    public static volatile CollectionAttribute<Animals, Pets> petsCollection;
    public static volatile CollectionAttribute<Animals, Accessories> accessoriesCollection;

}