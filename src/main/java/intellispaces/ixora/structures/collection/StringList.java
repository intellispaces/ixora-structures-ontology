package intellispaces.ixora.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

@Domain("01908201-f7a4-7ff7-b2a6-b28f9590c121")
public interface StringList extends List<String> {

  @Override
  @Transition("01909081-c018-7001-b637-2256652555f4")
  Collection<String> asCollection();

  @Transition("01908255-05a6-72c8-906c-7134182b2517")
  List<String> asList();

  @Override
  default Class<String> elementDomain() {
    return String.class;
  }

  @Override
  String element(int index);
}
