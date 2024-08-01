package intellispaces.ixora.structures.collection;

import tech.intellispaces.core.annotation.Domain;
import tech.intellispaces.core.annotation.Transition;
import tech.intellispaces.javastatements.type.Type;
import tech.intellispaces.javastatements.type.Types;

@Domain("019081b8-bfb3-7089-9d6c-6537ab3fca07")
public interface IntegerList extends NumberList<Integer> {

  /**
   * Downgrade mapping.
   */
  @Override
  @Transition("01909080-8b2e-798a-8467-150465a39848")
  Collection<Integer> asCollection();

  /**
   * Downgrade mapping.
   */
  @Transition("0190824d-8716-7f90-8c49-fa9a6ee24bcb")
  List<Integer> asList();

  @Override
  default Type<Integer> elementDomain() {
    return Types.of(Integer.class);
  }

  @Override
  Integer element(int index);
}
