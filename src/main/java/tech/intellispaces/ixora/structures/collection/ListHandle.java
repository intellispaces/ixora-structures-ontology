package tech.intellispaces.ixora.structures.collection;

import tech.intellispacesframework.core.object.ObjectHandle;

public interface ListHandle<E> extends ObjectHandle<List<E>>, List<E> {

  java.util.List<E> javaList();

  @Override
  E element(int index);

}
