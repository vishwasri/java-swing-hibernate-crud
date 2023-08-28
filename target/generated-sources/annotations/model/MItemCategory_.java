package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MItem;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-26T07:05:26")
@StaticMetamodel(MItemCategory.class)
public class MItemCategory_ { 

    public static volatile SingularAttribute<MItemCategory, Date> dateCreated;
    public static volatile SingularAttribute<MItemCategory, String> name;
    public static volatile CollectionAttribute<MItemCategory, MItem> mItemCollection;
    public static volatile SingularAttribute<MItemCategory, Integer> itemCategoryId;
    public static volatile SingularAttribute<MItemCategory, Date> dateDeleted;
    public static volatile SingularAttribute<MItemCategory, Integer> status;

}