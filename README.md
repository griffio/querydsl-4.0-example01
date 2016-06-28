# querydsl-4.0-example01

[querydsl-4.0 collections query](http://www.querydsl.com/static/querydsl/4.1.2/reference/html_single/#collections_integration)

Create a query delegate for a "value" domain object to "add" instances together as if there were numeric types.

KnownQuantity encapsulates BigDecimal value and implements "add" operation.

Querydsl requires a new template operator for "add" operation as it expects the types to extend Number. 

When executed in the QueryEngine, the expression calls the "add" method with another KnownQuantity instance.
~~~
 QKnownQuantity.knownQuantity.add(another)
~~~ 