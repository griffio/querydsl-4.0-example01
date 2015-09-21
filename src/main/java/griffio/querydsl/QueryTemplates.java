package griffio.querydsl;

import com.querydsl.collections.CollQueryTemplates;

public class QueryTemplates extends CollQueryTemplates {

  public QueryTemplates() {
    super();
    add(QueryOperators.ADD_QTY, "{0}.add({1})");
  }

}
