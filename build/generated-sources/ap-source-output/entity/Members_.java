package entity;

import entity.Feedbacks;
import entity.Orders;
import entity.Pethotel;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-01T12:02:53")
@StaticMetamodel(Members.class)
public class Members_ { 

    public static volatile SingularAttribute<Members, String> password;
    public static volatile SingularAttribute<Members, String> address;
    public static volatile SingularAttribute<Members, String> mail;
    public static volatile SingularAttribute<Members, String> phone;
    public static volatile CollectionAttribute<Members, Pethotel> pethotelCollection;
    public static volatile SingularAttribute<Members, String> name;
    public static volatile SingularAttribute<Members, Integer> mId;
    public static volatile CollectionAttribute<Members, Feedbacks> feedbacksCollection;
    public static volatile CollectionAttribute<Members, Orders> ordersCollection;

}