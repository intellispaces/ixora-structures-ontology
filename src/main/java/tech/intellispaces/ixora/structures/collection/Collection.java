package tech.intellispaces.ixora.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

/**
 * Homogeneous collection of elements.
 *
 * @param <E> collection element type.
 */
@Domain("715d235a-b6ee-4a0a-8166-dd908d6bf026")
public interface Collection<E> {

  @Transition("855a617e-1281-4f23-ac3b-be45e045b337")
  tech.intellispaces.ixora.basic.Domain<E> elementDomain();

  @Transition("ac251f1d-ecd8-45a0-bd05-972c71ed26aa")
  int size();
}
