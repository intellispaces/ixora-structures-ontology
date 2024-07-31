package intellispaces.ixora.structures.properties;

import tech.intellispaces.core.annotation.Preprocessing;

@Preprocessing(value = Properties.class, artifact = "ObjectHandle", extendWith = PropertiesHandleExtension.class)
public interface PropertiesHandleExtension<E> {

  java.util.Map<String, Object> nativeMap();
}
