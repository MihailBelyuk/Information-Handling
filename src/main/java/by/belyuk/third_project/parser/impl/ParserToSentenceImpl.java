package by.belyuk.third_project.parser.impl;

import by.belyuk.third_project.text_enum.TextElementType;
import by.belyuk.third_project.entity.Component;
import by.belyuk.third_project.entity.TextComposite;
import by.belyuk.third_project.exception.SomeException;
import by.belyuk.third_project.parser.TextElementsParser;
import by.belyuk.third_project.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class ParserToSentenceImpl implements TextElementsParser {
  private static final String SENTENCE_REGEXP = "";
  private List<String> sentences = new ArrayList<>();

  @Override
  public Component parse(String filePath) throws SomeException {
    Component sentenceComponent = new TextComposite(TextElementType.SENTENCE);
    TextReaderImpl reader = TextReaderImpl.getInstance();
    sentences = List.of(reader.read(filePath).strip().split(SENTENCE_REGEXP));

    for (String sentence : sentences) {
      sentenceComponent.add(sentence);
    }
    return sentenceComponent;
  }
}
