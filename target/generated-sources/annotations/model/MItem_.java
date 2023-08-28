package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MItemCategory;
import model.Sku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-26T07:05:26")
@StaticMetamodel(MItem.class)
public class MItem_ { 

    public static volatile SingularAttribute<MItem, String> image;
    public static volatile SingularAttribute<MItem, Double> reOrderLevel;
    public static volatile SingularAttribute<MItem, Short> isSynced;
    public static volatile SingularAttribute<MItem, String> itemCode;
    public static volatile SingularAttribute<MItem, Integer> expiryNotifyDays;
    public static volatile SingularAttribute<MItem, MItemCategory> itemCategoryId;
    public static volatile SingularAttribute<MItem, Short> isBarcodePrint;
    public static volatile SingularAttribute<MItem, Date> dateDeleted;
    public static volatile SingularAttribute<MItem, Short> isExpiryItem;
    public static volatile SingularAttribute<MItem, Integer> rackNumber;
    public static volatile SingularAttribute<MItem, Integer> itemId;
    public static volatile CollectionAttribute<MItem, Sku> skuCollection;
    public static volatile SingularAttribute<MItem, Date> dateCreated;
    public static volatile SingularAttribute<MItem, Integer> bayNumber;
    public static volatile SingularAttribute<MItem, String> name;
    public static volatile SingularAttribute<MItem, Integer> shelfNumber;
    public static volatile SingularAttribute<MItem, String> barcode;
    public static volatile SingularAttribute<MItem, Integer> status;

}