package entity;

import entity.Members;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-01T12:02:53")
@StaticMetamodel(Pethotel.class)
public class Pethotel_ { 

    public static volatile SingularAttribute<Pethotel, Date> dateStart;
    public static volatile SingularAttribute<Pethotel, String> namePet;
    public static volatile SingularAttribute<Pethotel, Integer> price;
    public static volatile SingularAttribute<Pethotel, String> pHId;
    public static volatile SingularAttribute<Pethotel, Members> mId;
    public static volatile SingularAttribute<Pethotel, Date> dateEnd;

}