package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.SkuBatch;
import model.StockLedgerPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-25T01:16:33")
@StaticMetamodel(StockLedger.class)
public class StockLedger_ { 

    public static volatile SingularAttribute<StockLedger, Date> date;
    public static volatile SingularAttribute<StockLedger, ? extends Object> userData;
    public static volatile SingularAttribute<StockLedger, Double> outQty;
    public static volatile SingularAttribute<StockLedger, StockLedgerPK> stockLedgerPK;
    public static volatile SingularAttribute<StockLedger, Double> inQty;
    public static volatile SingularAttribute<StockLedger, SkuBatch> batchId;

}