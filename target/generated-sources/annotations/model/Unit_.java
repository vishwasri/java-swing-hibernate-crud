package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Sku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-26T06:45:27")
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, String> symbol;
    public static volatile CollectionAttribute<Unit, Sku> skuCollection;
    public static volatile SingularAttribute<Unit, String> name;
    public static volatile SingularAttribute<Unit, Integer> unitId;
    public static volatile SingularAttribute<Unit, Integer> status;

}