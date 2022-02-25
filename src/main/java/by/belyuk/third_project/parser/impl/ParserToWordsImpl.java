package by.belyuk.third_project.parser.impl;

import by.belyuk.third_project.text_enum.TextElementType;
import by.belyuk.third_project.entity.Component;
import by.belyuk.third_project.entity.TextComposite;
import by.belyuk.third_project.exception.SomeException;
import by.belyuk.third_project.parser.TextElementsParser;
import by.belyuk.third_project.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class ParserToWordsImpl implements TextElementsParser {
  private static final String WORDS_REGEXP = "\\s+";
  private List<String> words = new ArrayList<>();

  @Override
  public Component parse(String filePath) throws SomeException {
    Component wordsComponent = new TextComposite(TextElementType.WORD);
    TextReaderImpl reader = TextReaderImpl.getInstance();
    words = List.of(reader.read(filePath).strip().split(WORDS_REGEXP));
    for (String word : words) {
      wordsComponent.add(word);
    }
    return wordsComponent;
  }
}
