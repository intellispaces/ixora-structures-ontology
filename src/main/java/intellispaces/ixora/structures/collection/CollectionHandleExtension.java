package intellispaces.ixora.structures.collection;

import tech.intellispaces.core.annotation.Preprocessing;

@Preprocessing(value = Collection.class, artifact = "ObjectHandle", extendWith = CollectionHandleExtension.class)
public interface CollectionHandleExtension<E> {

  java.util.Collection<E> nativeCollection();
}
