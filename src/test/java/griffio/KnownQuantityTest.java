package griffio;

import com.google.common.collect.Lists;
import com.querydsl.collections.CollQuery;
import griffio.domain.KnownQuantity;
import griffio.querydsl.QueryCollections;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static griffio.domain.QKnownQuantity.*;

public class KnownQuantityTest {

  @Test
  public void knownQuantity() throws Exception {

    KnownQuantity one = new KnownQuantity(BigDecimal.ONE);
    KnownQuantity ten = new KnownQuantity(BigDecimal.TEN);

    List<KnownQuantity> qtys = Lists.newArrayList(ten);

    CollQuery<Void> query = QueryCollections.from(knownQuantity, qtys);

    KnownQuantity totalQuantity = query.select(knownQuantity.add(one)).fetchOne();

    assertThat(totalQuantity).isEqualTo(ten.add(one));

  }

}