package tech.intellispaces.ixora.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

/**
 * Homogeneous ordered list.
 *
 * @param <E> list element type.
 */
@Domain("f260fb9d-fd6f-4421-a609-71c672c8fffc")
public interface List<E> extends Collection<E> {

  @Transition("a8b23e74-2f8a-41eb-9427-a50e8274dc09")
  E element(int index);
}
