package griffio.querydsl;

import com.querydsl.collections.CollQuery;
import com.querydsl.collections.CollQueryTemplates;
import com.querydsl.core.types.Path;

public final class QueryCollections {

  final static CollQueryTemplates templates = new QueryTemplates();

  public static <A> CollQuery<Void> from(Path<A> path, Iterable<A> col) {
    return new CollQuery<Void>(templates).from(path, col);
  }
}
