package intellispaces.ixora.mindstructs.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

/**
 * List of numbers.
 *
 * @param <E> list element domain type.
 */
@Domain("01908c74-4692-7fe2-8f51-375bda2efc40")
public interface NumberList<E extends Number> extends List<E> {

  @Override
  @Transition("0190907f-afde-7de4-a6ee-0ad4363dc3d8")
  Collection<E> asCollection();

  @Transition("01908c74-6c7e-7890-96cd-9dc2531999ef")
  List<E> asList();

  @Override
  default Class<E> elementDomain() {
    return (Class<E>) Number.class;
  }

  @Override
  E element(int index);
}
