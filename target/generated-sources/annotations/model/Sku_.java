package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ItemColor;
import model.MItem;
import model.Sizes;
import model.Unit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-26T06:48:09")
@StaticMetamodel(Sku.class)
public class Sku_ { 

    public static volatile SingularAttribute<Sku, Sizes> sizesSizeId;
    public static volatile SingularAttribute<Sku, Unit> unitUnitId;
    public static volatile SingularAttribute<Sku, ItemColor> itemColorItemColorId;
    public static volatile SingularAttribute<Sku, MItem> mItemItemId;
    public static volatile SingularAttribute<Sku, Double> stock;
    public static volatile SingularAttribute<Sku, Integer> skuId;

}