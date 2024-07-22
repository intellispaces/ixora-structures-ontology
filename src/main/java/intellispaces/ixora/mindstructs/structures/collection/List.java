package intellispaces.ixora.mindstructs.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

/**
 * Homogeneous ordered list.
 *
 * @param <E> list element domain type.
 */
@Domain("f260fb9d-fd6f-4421-a609-71c672c8fffc")
public interface List<E> extends Collection<E> {

  @Transition("01909079-ab91-75ba-8fd0-4a2cb5391791")
  Collection<? extends E> asCollection();

  @Transition("a8b23e74-2f8a-41eb-9427-a50e8274dc09")
  E element(int index);
}
