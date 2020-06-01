package entity;

import entity.Members;
import entity.OdersDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-01T12:02:53")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Date> oderDate;
    public static volatile SingularAttribute<Orders, Integer> total;
    public static volatile SingularAttribute<Orders, Integer> oderId;
    public static volatile SingularAttribute<Orders, Members> mId;
    public static volatile SingularAttribute<Orders, String> paymentBy;
    public static volatile SingularAttribute<Orders, String> transport;
    public static volatile CollectionAttribute<Orders, OdersDetails> odersDetailsCollection;
    public static volatile SingularAttribute<Orders, String> shipAddress;

}