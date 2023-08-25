package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Interface;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Date> dateCreated;
    public static volatile CollectionAttribute<UserRole, Interface> interfaceCollection;
    public static volatile SingularAttribute<UserRole, String> roleName;
    public static volatile CollectionAttribute<UserRole, ? extends Object> userDataCollection;
    public static volatile SingularAttribute<UserRole, Integer> userRoleId;
    public static volatile SingularAttribute<UserRole, Integer> status;

}