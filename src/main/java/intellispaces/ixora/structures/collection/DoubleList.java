package intellispaces.ixora.structures.collection;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;

@Domain("019081ff-e48c-773d-b6af-f6f3ec15ced9")
public interface DoubleList extends NumberList<Double> {

  @Override
  @Transition("01909080-c97f-77f1-9a5a-f20dba6ed8a6")
  Collection<Double> asCollection();

  @Transition("01908254-ac97-7643-8cce-d058caad1aba")
  List<Double> asList();

  @Override
  default Class<Double> elementDomain() {
    return Double.class;
  }

  @Override
  Double element(int index);
}
