package entity;

import entity.Animals;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-10T21:50:33")
@StaticMetamodel(Foods.class)
public class Foods_ { 

    public static volatile SingularAttribute<Foods, String> fId;
    public static volatile SingularAttribute<Foods, Animals> cFId;
    public static volatile SingularAttribute<Foods, String> image;
    public static volatile SingularAttribute<Foods, Integer> price;
    public static volatile SingularAttribute<Foods, String> name;
    public static volatile SingularAttribute<Foods, String> description;

}