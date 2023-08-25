package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Sku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(Sizes.class)
public class Sizes_ { 

    public static volatile SingularAttribute<Sizes, Integer> sizeId;
    public static volatile CollectionAttribute<Sizes, Sku> skuCollection;
    public static volatile SingularAttribute<Sizes, Date> dateCreated;
    public static volatile SingularAttribute<Sizes, String> name;
    public static volatile SingularAttribute<Sizes, Integer> status;

}