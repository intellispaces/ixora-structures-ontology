package intellispaces.ixora.mindstructs.structures.collection;

import tech.intellispaces.framework.core.annotation.Preprocessing;

@Preprocessing(value = List.class, artifact = "ObjectHandle", extendWith = ListHandleExtension.class)
public interface ListHandleExtension<E> {

  java.util.List<E> nativeList();
}
