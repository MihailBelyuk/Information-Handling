package by.belyuk.third_project.parser;

import by.belyuk.third_project.entity.Component;
import by.belyuk.third_project.exception.SomeException;

public interface TextElementsParser {
  Component parse(String text) throws SomeException;
}
