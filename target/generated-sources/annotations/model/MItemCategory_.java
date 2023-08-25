package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CategoryGroup;
import model.MItem;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(MItemCategory.class)
public class MItemCategory_ { 

    public static volatile SingularAttribute<MItemCategory, Date> dateCreated;
    public static volatile CollectionAttribute<MItemCategory, CategoryGroup> categoryGroupCollection;
    public static volatile SingularAttribute<MItemCategory, String> name;
    public static volatile CollectionAttribute<MItemCategory, MItem> mItemCollection;
    public static volatile SingularAttribute<MItemCategory, Integer> itemCategoryId;
    public static volatile SingularAttribute<MItemCategory, Date> dateDeleted;
    public static volatile SingularAttribute<MItemCategory, Integer> status;

}