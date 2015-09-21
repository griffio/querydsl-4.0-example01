package griffio.querydsl;

import com.querydsl.core.types.Operator;
import griffio.domain.KnownQuantity;

public class QueryOperators {

  public static final AddQuantity ADD_QTY = new AddQuantity();

  public static class AddQuantity implements Operator {
    private static final long serialVersionUID = -1L;

    @Override
    public String name() {
      return "ADD_QUANTITY";
    }

    @Override
    public Class<?> getType() {
      return KnownQuantity.class;
    }

    @Override
    public String toString() {
      return "ADD_QUANTITY";
    }
  }

}
