package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(Interface.class)
public class Interface_ { 

    public static volatile SingularAttribute<Interface, String> image;
    public static volatile SingularAttribute<Interface, Date> dateCreated;
    public static volatile CollectionAttribute<Interface, UserRole> userRoleCollection;
    public static volatile SingularAttribute<Interface, String> displayName;
    public static volatile SingularAttribute<Interface, String> name;
    public static volatile SingularAttribute<Interface, Integer> interfaceId;
    public static volatile SingularAttribute<Interface, Integer> status;

}