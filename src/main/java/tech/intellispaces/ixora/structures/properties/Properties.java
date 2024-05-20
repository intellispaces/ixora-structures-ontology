package tech.intellispaces.ixora.structures.properties;

import tech.intellispacesframework.core.annotation.Domain;
import tech.intellispacesframework.core.annotation.Transition;

/**
 * Properties are a hierarchical set of properties.
 */
@Domain("eccd18a1-ec7a-4949-9acd-2b2fa9576da1")
public interface Properties {

  @Transition("4e01aa7a-3fd4-4509-9387-921c30ecf5f9")
  int integerValue(String path) throws InvalidPropertyException;

  @Transition("ffcd77b5-032f-49db-8dfd-c792a19d1005")
  double doubleValue(String path) throws InvalidPropertyException;

  @Transition("4cc73514-1a59-4560-ba50-7045360b853c")
  String stringValue(String path) throws InvalidPropertyException;

  @Transition("e033ddc5-7f4d-4bbd-8958-8b9c34fdfc95")
  Properties properties(String path) throws InvalidPropertyException;

  @Transition("e8e1fb09-b22e-4e66-bee5-34db85e4ada3")
  int[] integerList(String path) throws InvalidPropertyException;

  @Transition("101bf792-aa89-4114-ba58-26d78487a4a5")
  double[] doubleList(String path) throws InvalidPropertyException;

  @Transition("f6d6c228-cfe0-4bcd-80b8-b0bd23e606c7")
  String[] stringList(String path) throws InvalidPropertyException;

  @Transition("b48ef2de-6bbc-4c9c-a0b1-e3f1c6ca33d1")
  Properties[] propertiesList(String path) throws InvalidPropertyException;
}
