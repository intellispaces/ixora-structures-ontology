package tech.intellispaces.ixora.structures.properties;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.ixora.structures.collection.List;

@Domain("01908202-a961-7987-96ad-e2b5908d7cab")
public interface PropertiesList extends List<Properties> {

  @Transition("01908255-6058-7c54-9377-ed0e1b5d9b68")
  List<Properties> asList();

  @Override
  default Class<Properties> elementDomain() {
    return Properties.class;
  }

  @Override
  Properties element(int index);
}
