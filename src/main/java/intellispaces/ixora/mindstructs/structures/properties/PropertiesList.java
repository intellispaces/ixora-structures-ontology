package intellispaces.ixora.mindstructs.structures.properties;

import intellispaces.ixora.mindstructs.structures.collection.Collection;
import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import intellispaces.ixora.mindstructs.structures.collection.List;

@Domain("01908202-a961-7987-96ad-e2b5908d7cab")
public interface PropertiesList extends List<Properties> {

  @Override
  @Transition("01909082-1dc7-70a0-b24b-643240d62a8a")
  Collection<? extends Properties> asCollection();

  @Transition("01908255-6058-7c54-9377-ed0e1b5d9b68")
  List<? extends Properties> asList();

  @Override
  default Class<? extends Properties> elementDomain() {
    return Properties.class;
  }

  @Override
  Properties element(int index);
}
