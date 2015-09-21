package griffio.querydsl;

import com.querydsl.core.annotations.QueryDelegate;
import com.querydsl.core.types.Expression;
import griffio.domain.KnownQuantity;
import griffio.domain.QKnownQuantity;

import static com.querydsl.core.types.dsl.Expressions.*;
import static griffio.querydsl.QueryOperators.ADD_QTY;

public class QueryExtensions {

  @QueryDelegate(value = KnownQuantity.class)
  public static Expression<KnownQuantity> add(QKnownQuantity entityPath, KnownQuantity knownQuantity) {
    return operation(KnownQuantity.class, ADD_QTY, entityPath, constant(knownQuantity));
  }

}
