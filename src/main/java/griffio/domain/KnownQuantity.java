package griffio.domain;

import com.querydsl.core.annotations.QueryEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

@QueryEntity
public final class KnownQuantity implements Serializable {

  private static final long serialVersionUID = 1L;

  private final BigDecimal value;

  public KnownQuantity(BigDecimal value) {
    this.value = value.setScale(2, RoundingMode.HALF_UP);
  }

  public BigDecimal toBigDecimal() {
    return value;
  }

  public KnownQuantity add(KnownQuantity that) {
    return new KnownQuantity(value.add(that.value));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    KnownQuantity that = (KnownQuantity) o;

    return !(value != null ? !value.equals(that.value) : that.value != null);
  }

  @Override
  public int hashCode() {
    return value != null ? value.hashCode() : 0;
  }


  @Override
  public String toString() {
    return String.format("KnownQuantity:value:%s", value);
  }
}
