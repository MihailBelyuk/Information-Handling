package by.belyuk.third_project.parser.impl;

import by.belyuk.third_project.text_enum.TextElementType;
import by.belyuk.third_project.entity.Component;
import by.belyuk.third_project.entity.TextComposite;
import by.belyuk.third_project.exception.SomeException;
import by.belyuk.third_project.parser.TextElementsParser;
import by.belyuk.third_project.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class ParserToSymbolsImpl implements TextElementsParser {
  private static final String SYMBOL_REGEXP = " ";
  private List<String> symbols = new ArrayList<>();

  @Override
  public Component parse(String filePath) throws SomeException {
    Component symbolsComponent = new TextComposite(TextElementType.SYMBOL);
    TextReaderImpl reader = TextReaderImpl.getInstance();
    symbols = List.of(reader.read(filePath).strip().split(SYMBOL_REGEXP));
    for (String symbol : symbols) {
      symbolsComponent.add(symbol);
    }
    return symbolsComponent;
  }
}
