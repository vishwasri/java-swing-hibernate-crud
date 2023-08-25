package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(LoginData.class)
public class LoginData_ { 

    public static volatile SingularAttribute<LoginData, Date> logoutTime;
    public static volatile SingularAttribute<LoginData, ? extends Object> userDataId;
    public static volatile SingularAttribute<LoginData, Date> loginTime;
    public static volatile SingularAttribute<LoginData, Integer> loginDataId;

}