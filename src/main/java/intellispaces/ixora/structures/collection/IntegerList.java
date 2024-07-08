package intellispaces.ixora.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

@Domain("019081b8-bfb3-7089-9d6c-6537ab3fca07")
public interface IntegerList extends NumberList<Integer> {

  @Override
  @Transition("01909080-8b2e-798a-8467-150465a39848")
  Collection<Integer> asCollection();

  @Transition("0190824d-8716-7f90-8c49-fa9a6ee24bcb")
  List<Integer> asList();

  @Override
  default Class<Integer> elementDomain() {
    return Integer.class;
  }

  @Override
  Integer element(int index);
}
