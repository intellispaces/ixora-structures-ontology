package tech.intellispaces.ixora.structures.properties;

import tech.intellispacesframework.core.annotation.Ontology;
import tech.intellispacesframework.core.annotation.Transition;

@Ontology
public interface PropertiesOntology {

  @Transition("1830e924-2c78-4f18-b9eb-39f002cbeea6")
  Properties stringToProperties(String string) throws InvalidPropertyException;

  @Transition("9bf2dd05-5c47-4bf7-9189-c8000699a8f1")
  Properties bytesToProperties(byte[] bytes) throws InvalidPropertyException;

  @Transition("cafc0a2e-a1da-44e1-997f-2db62f7e385c")
  <T> T propertiesToData(Properties properties, Class<T> domainClass);
}
