package tech.intellispaces.ixora.structures.collection;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

/**
 * One-way cursor.
 *
 * @param <E> cursor element type.
 */
@Domain("3826cfd5-1b2a-4441-86b7-6ff0a9b2a7cd")
public interface Cursor<E> {

  @Transition("8816842b-3aa7-4421-b2c5-3ac5b3da9b24")
  tech.intellispaces.ixora.basic.Domain<E> elementDomain();

  @Transition("3089ff8a-0bfc-4ad0-ad58-093b84690e66")
  E currentValue();

  @Transition("22a53488-46f1-4727-bebf-1ed04c76a51e")
  boolean hasNext();

  @Transition("493c84b9-36cc-4312-b887-a37f8e21123e")
  Cursor<E> sameCursorAfterShift();
}
