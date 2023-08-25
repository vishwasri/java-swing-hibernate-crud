package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MItemCategory;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(CategoryGroup.class)
public class CategoryGroup_ { 

    public static volatile SingularAttribute<CategoryGroup, String> groupName;
    public static volatile SingularAttribute<CategoryGroup, Date> dateCreated;
    public static volatile CollectionAttribute<CategoryGroup, MItemCategory> mItemCategoryCollection;
    public static volatile SingularAttribute<CategoryGroup, Integer> categoryGroupId;
    public static volatile SingularAttribute<CategoryGroup, Date> dateDeleted;
    public static volatile SingularAttribute<CategoryGroup, Integer> status;

}