package entity;

import entity.Members;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-19T10:35:21")
@StaticMetamodel(Pethotel.class)
public class Pethotel_ { 

    public static volatile SingularAttribute<Pethotel, String> dateStart;
    public static volatile SingularAttribute<Pethotel, String> namePet;
    public static volatile SingularAttribute<Pethotel, Integer> price;
    public static volatile SingularAttribute<Pethotel, Integer> pHId;
    public static volatile SingularAttribute<Pethotel, Members> mId;
    public static volatile SingularAttribute<Pethotel, String> dateEnd;
    public static volatile SingularAttribute<Pethotel, String> status;

}