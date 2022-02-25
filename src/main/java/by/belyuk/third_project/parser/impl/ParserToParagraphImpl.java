package by.belyuk.third_project.parser.impl;

import by.belyuk.third_project.text_enum.TextElementType;
import by.belyuk.third_project.entity.Component;
import by.belyuk.third_project.entity.TextComposite;
import by.belyuk.third_project.exception.SomeException;
import by.belyuk.third_project.parser.TextElementsParser;
import by.belyuk.third_project.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class ParserToParagraphImpl implements TextElementsParser {
    private static final String PARAGRAPH_REGEXP = "\s{4}";
  private List<String> paragraphs = new ArrayList<>();

  @Override
  public Component parse(String filePath) throws SomeException {
    Component paragraphComponent = new TextComposite(TextElementType.PARAGRAPH);
    TextReaderImpl reader = TextReaderImpl.getInstance();
    paragraphs = List.of(reader.read(filePath).strip().split(PARAGRAPH_REGEXP));

    for (String paragraph : paragraphs) {
      paragraphComponent.add(paragraph);
    }
    return paragraphComponent;
  }
}
