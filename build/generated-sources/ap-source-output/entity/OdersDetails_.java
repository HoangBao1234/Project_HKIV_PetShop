package entity;

import entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-04T19:29:37")
@StaticMetamodel(OdersDetails.class)
public class OdersDetails_ { 

    public static volatile SingularAttribute<OdersDetails, Integer> odId;
    public static volatile SingularAttribute<OdersDetails, Integer> quantity;
    public static volatile SingularAttribute<OdersDetails, String> productId;
    public static volatile SingularAttribute<OdersDetails, Orders> oderId;
    public static volatile SingularAttribute<OdersDetails, Integer> productPrice;

}