package entity;

import entity.Accessories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-06-09T13:28:11")
@StaticMetamodel(CateES.class)
public class CateES_ { 

    public static volatile SingularAttribute<CateES, Integer> cEId;
    public static volatile SingularAttribute<CateES, String> name;
    public static volatile CollectionAttribute<CateES, Accessories> accessoriesCollection;

}