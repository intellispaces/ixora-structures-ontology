package intellispaces.ixora.mindstructs.structures.collection;

import tech.intellispaces.framework.core.annotation.Preprocessing;

@Preprocessing(value = Collection.class, artifact = "ObjectHandle", extendWith = CollectionHandleExtension.class)
public interface CollectionHandleExtension<E> {

  java.util.Collection<? extends E> nativeCollection();
}
