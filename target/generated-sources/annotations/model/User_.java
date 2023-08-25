package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.LoginData;
import model.StockLedger;
import model.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> userDataId;
    public static volatile SingularAttribute<User, String> password;
    public static volatile CollectionAttribute<User, LoginData> loginDataCollection;
    public static volatile SingularAttribute<User, ? extends Object> createdDate;
    public static volatile SingularAttribute<User, String> fullName;
    public static volatile SingularAttribute<User, Integer> pinNumber;
    public static volatile CollectionAttribute<User, StockLedger> stockLedgerCollection;
    public static volatile SingularAttribute<User, UserRole> userRoleId;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, Integer> status;

}